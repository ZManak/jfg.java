/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uni.d3.e1;

import models.Student;
import persistence.Controller;

/**
 *
 * @author Manak
 */
public class D3E1 {

    public static void main(String[] args) {

        Controller controller = new Controller();
        
        Student student = new Student("Manak", 20, 100);
        
        try {
            controller.createStudent(student);
            System.out.println("Student created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
}
