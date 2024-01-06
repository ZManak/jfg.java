package persistence;

import models.StudentJpaController;
import models.Student;
import models.exceptions.NonexistentEntityException;
import models.exceptions.PreexistingEntityException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
        StudentJpaController stuJPA = new StudentJpaController();

    public void createStudent(Student student)
            throws PreexistingEntityException, NonexistentEntityException {
        try {
            stuJPA.create(student);
        } catch (PreexistingEntityException ex) {
            Logger.getLogger(persistence.Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteStudent(int id) {
        try {
            stuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(persistence.Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Student> findStudent() throws Exception {
        return stuJPA.findStudentEntities();
    }

    public Student findName(String name) throws Exception {

        List<Student> students = stuJPA.findStudentEntities();
        for (Student stu : students) {
            if (stu.getName().equals(name)) {
                return stu;
            }
        }
        return null;
    }

    public Student findId(Integer id) throws Exception {
        try {
            List<Student> students = stuJPA.findStudentEntities();
            for (Student emp : students) {
                if (emp.getId() == id) {
                    return emp;
                }
            }
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(persistence.Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }


    public void updateStudent(Student emp) throws NonexistentEntityException, Exception{
        try {
            stuJPA.edit(emp);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(persistence.Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
