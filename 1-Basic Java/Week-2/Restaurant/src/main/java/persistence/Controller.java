/*
 * Click nbfs://nbhost/SystemFileSystem/Titemlates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Titemlates/Classes/Class.java to edit this titemlate
 */
package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Meal;
import logic.MealJpaController;
import logic.exceptions.NonexistentEntityException;
import logic.exceptions.PreexistingEntityException;

/**
 *
 * @author Manak
 */
public class Controller {
       MealJpaController mealJPA = new MealJpaController();

    public void createMeal(Meal meal)
            throws PreexistingEntityException, NonexistentEntityException {
        try {
            mealJPA.create(meal);
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(persistence.Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMeal(int id) {
        try {
            mealJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(persistence.Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Meal> findMeal() throws Exception {
        return mealJPA.findMealEntities();
    }

    public Meal findName(String name) throws Exception {

        List<Meal> meals = mealJPA.findMealEntities();
        for (Meal meal : meals) {
            if (meal.getName().equals(name)) {
                return meal;
            }
        }
        return null;
    }

    public Meal findId(Integer id) throws Exception {
        try {
            List<Meal> meals = mealJPA.findMealEntities();
            for (Meal item : meals) {
                if (item.getId() == id) {
                    return item;
                }
            }
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(persistence.Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    public void updateMeal(Meal item) throws NonexistentEntityException, Exception{
        try {
            mealJPA.edit(item);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(persistence.Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
