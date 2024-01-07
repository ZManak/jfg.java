/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.restaurant;

import logic.Meal;
import logic.exceptions.NonexistentEntityException;
import logic.exceptions.PreexistingEntityException;
import persistence.Controller;

/**
 *
 * @author Manak
 */
public class Restaurant {

    public static void main(String[] args) throws Exception {
        Controller control = new Controller();
        
        Meal hummus = new Meal(12.5, "Hummus", true);
        Meal steak = new Meal(10.5, "Steak", false);
        Meal cake = new Meal(4.5, "Cake", true);
        
        try {
        control.createMeal(hummus);
        control.createMeal(steak);
        control.createMeal(cake);
        System.out.println("Meals added: " + hummus.getName() + " " + steak.getName() + " " + cake.getName());   
        System.out.println("Deleting meal ");
        control.deleteMeal(1);
        steak.setName("Bistec");
        steak.setPrice(9.0);
        System.out.println("Updating meal: ");
        control.updateMeal(steak);
        } catch (NonexistentEntityException e) {
            System.out.println(e);
        } catch (PreexistingEntityException e2) {
            System.out.println(e2);
        } 
        }
}
