/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import models.exceptions.NonexistentEntityException;
import models.exceptions.PreexistingEntityException;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Manak
 */
public class StudentJpaController implements Serializable {
    public StudentJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     * Default constructor of the class
     */
    public StudentJpaController() {
        emf = Persistence.createEntityManagerFactory("ExampleUnit");
    }

    /**
     * Entity manager factory, used to create the entity manager and perform the
     * CRUD operations
     */
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Student student)
            throws PreexistingEntityException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }


    public void edit(Student student) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            student = em.merge(student);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = student.getId();
                try {
                    if (findStudent(id) == null) {
                        throw new NonexistentEntityException("The student with id " + id + " no longer exists.");
                    }
                }
                catch (NonexistentEntityException e) {
                    throw new NonexistentEntityException("The student with id " + id + " no longer exists.");
                }
                catch (Exception e) {
                    throw new Exception("The student with id " + id + " no longer exists.");
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
            Student student;
            try {
                student = em.getReference(Student.class,
                        id);
            } catch (EntityNotFoundException e) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", e);
            }
            em.remove(student);
            em.getTransaction().commit();
            System.out.println("Student deleted");
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Student> findStudentEntities() throws Exception {
        try {
            return findAllStudentsEntities(true, -1, -1);
        } catch (NonexistentEntityException e) {
            throw new NonexistentEntityException("Couldn't find students. Params: maxResults: -1, firstResult: -1");
        } catch (Exception e) {
            throw new Exception("Couldn't find students. Params: maxResults: -1, firstResult: -1");
        }
    }

    public List<Student> findStudentEntities(int maxResults, int firstResult)
            throws Exception {
        try {
            return findAllStudentsEntities(false, maxResults, firstResult);
        } catch (NonexistentEntityException e) {
            throw new NonexistentEntityException("Couldn't find students. Params: maxResults: " + maxResults
                                                         + ", firstResult: " + firstResult + " out of bounds.");
        } catch (Exception e) {
            throw new Exception("Couldn't find students. Params: maxResults: " + maxResults + ", firstResult: "
                                        + firstResult + " out of bounds.");
        }
    }

    private List<Student> findAllStudentsEntities(boolean all, int maxResults, int firstResult) throws Exception {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Student> cq = cb.createQuery(Student.class);
            Root<Student> root = cq.from(Student.class);
            cq.select(root);
            TypedQuery<Student> query = em.createQuery(cq); // Update the type of Query to TypedQuery<Student>
            if (!all) {
                query.setMaxResults(maxResults);
                query.setFirstResult(firstResult);
            }
            return query.getResultList(); // Cast the result to List<Student>
        } catch (Exception e) {
            throw new Exception("Couldn't find students. Params: maxResults: " + maxResults + ", firstResult: "
                                        + firstResult + " out of bounds.");
        } finally {
            em.close();
        }
    }
    public Student findStudent(int id) throws NonexistentEntityException {
        EntityManager em = getEntityManager();
        try {
            return em.find(Student.class, id);
        } finally {
            em.close();
        }
    }

    public int getStudentsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Student> cq = cb.createQuery(Student.class);
            Root<Student> rt = cq.from(Student.class);
            cq.multiselect(cb.count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
