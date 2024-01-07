/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logic.exceptions.NonexistentEntityException;
import logic.exceptions.PreexistingEntityException;

/**
 *
 * @author Manak
 */
public class MealJpaController implements Serializable {
    public MealJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     * Default constructor of the class
     */
    public MealJpaController() {
        emf = Persistence.createEntityManagerFactory("RestaurantUnit");
    }

    /**
     * Entity manager factory, used to create the entity manager and perform the
     * CRUD operations
     */
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Meal meal)
            throws PreexistingEntityException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(meal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }


    public void edit(Meal meal) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            meal = em.merge(meal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = meal.getId();
                try {
                    if (findMeal(id) == null) {
                        throw new NonexistentEntityException("The meal with id " + id + " no longer exists.");
                    }
                }
                catch (NonexistentEntityException e) {
                    throw new NonexistentEntityException("The meal with id " + id + " no longer exists.");
                }
                catch (Exception e) {
                    throw new Exception("The meal with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Meal meal;
            try {
                meal = em.getReference(Meal.class,
                        id);
            } catch (EntityNotFoundException e) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", e);
            }
            em.remove(meal);
            em.getTransaction().commit();
            System.out.println("Meal deleted");
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Meal> findMealEntities() throws Exception {
        try {
            return findAllMealsEntities(true, -1, -1);
        } catch (NonexistentEntityException e) {
            throw new NonexistentEntityException("Couldn't find meals. Params: maxResults: -1, firstResult: -1");
        } catch (Exception e) {
            throw new Exception("Couldn't find meals. Params: maxResults: -1, firstResult: -1");
        }
    }

    public List<Meal> findMealEntities(int maxResults, int firstResult)
            throws Exception {
        try {
            return findAllMealsEntities(false, maxResults, firstResult);
        } catch (NonexistentEntityException e) {
            throw new NonexistentEntityException("Couldn't find meals. Params: maxResults: " + maxResults
                                                         + ", firstResult: " + firstResult + " out of bounds.");
        } catch (Exception e) {
            throw new Exception("Couldn't find meals. Params: maxResults: " + maxResults + ", firstResult: "
                                        + firstResult + " out of bounds.");
        }
    }

    private List<Meal> findAllMealsEntities(boolean all, int maxResults, int firstResult) throws Exception {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Meal> cq = cb.createQuery(Meal.class);
            Root<Meal> root = cq.from(Meal.class);
            cq.select(root);
            TypedQuery<Meal> query = em.createQuery(cq); // Update the type of Query to TypedQuery<Meal>
            if (!all) {
                query.setMaxResults(maxResults);
                query.setFirstResult(firstResult);
            }
            return query.getResultList(); // Cast the result to List<Meal>
        } catch (Exception e) {
            throw new Exception("Couldn't find meals. Params: maxResults: " + maxResults + ", firstResult: "
                                        + firstResult + " out of bounds.");
        } finally {
            em.close();
        }
    }
    public Meal findMeal(int id) throws NonexistentEntityException {
        EntityManager em = getEntityManager();
        try {
            return em.find(Meal.class, id);
        } finally {
            em.close();
        }
    }

    public int getMealsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Meal> cq = cb.createQuery(Meal.class);
            Root<Meal> rt = cq.from(Meal.class);
            cq.multiselect(cb.count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
