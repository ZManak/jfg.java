import constants.Position;
import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Javi", Position.MANAGER, 2000),
                new Employee("BonJobi", Position.DEVELOPER, 3000.5),
                new Employee("SteveMcQueen", Position.TESTER, 570),
                new Employee("Inspector Gadget", Position.DESIGNER, 200),
                new Employee("Doreaemon", Position.ANALYST, 3007),
                new Employee("John Cena", Position.MANAGER, 2001),
                new Employee("Mufasa", Position.DEVELOPER, 167852),
                new Employee("Steve Jobs", Position.TESTER, 500.75),
                new Employee("Silvia Plath", Position.DESIGNER, 1750.5),
                new Employee("Henry Miller", Position.ANALYST, 500)
        );

        Stream<Employee> developers = employees.stream().filter(employee -> employee.getPosition().equals(Position.DEVELOPER));
        List<Employee> developersList = developers.toList();
        System.out.println("Developers: " + developersList.size());
        developersList.forEach(employee -> System.out.println(employee.getName() + " " + employee.getSalary()));
        System.out.println("--------------------------------------------------");
        Stream<Employee> testers = employees.stream().filter(employee -> employee.getPosition().equals(Position.TESTER));
        List<Employee> testersList = testers.toList();
        System.out.println("Testers: " + testersList.size());
        testersList.forEach(employee -> System.out.println(employee.getName() + " " + employee.getSalary()));
        System.out.println("--------------------------------------------------");
        Stream<Employee> designers = employees.stream().filter(employee -> employee.getPosition().equals(Position.DESIGNER));
        System.out.println(designers);
        System.out.println("--------------------------------------------------");
        Stream<Employee> analysts = employees.stream().filter(employee -> employee.getPosition().equals(Position.ANALYST));
        System.out.println(analysts);
        System.out.println("--------------------------------------------------");
        Stream<Employee> managers = employees.stream().filter(employee -> employee.getPosition().equals(Position.MANAGER));
        System.out.println(managers);
        System.out.println("--------------------------------------------------");
        //Filter by salary and return the list of employees with that salary
        Stream<Employee> highSalary = employees.stream().filter(employee -> employee.getSalary() > 700);
        for (Employee employee : highSalary.toArray(Employee[]::new)) {
            System.out.println("Salaries over 700: " + employee.getName() + " " + employee.getSalary());
        }
        System.out.println("--------------------------------------------------");

        //Mean salary ny position
        double meanSalaryDevelopers = employees.stream().filter(employee -> employee.getPosition().equals(Position.DEVELOPER)).mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println(meanSalaryDevelopers);
        System.out.println("--------------------------------------------------");
        double meanSalaryTesters = employees.stream().filter(employee -> employee.getPosition().equals(Position.TESTER)).mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println(meanSalaryTesters);
        System.out.println("--------------------------------------------------");
        double meanSalaryDesigners = employees.stream().filter(employee -> employee.getPosition().equals(Position.DESIGNER)).mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println(meanSalaryDesigners);
        System.out.println("--------------------------------------------------");
        double meanSalaryAnalysts = employees.stream().filter(employee -> employee.getPosition().equals(Position.ANALYST)).mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println(meanSalaryAnalysts);
        System.out.println("--------------------------------------------------");
        double meanSalaryManagers = employees.stream().filter(employee -> employee.getPosition().equals(Position.MANAGER)).mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println(meanSalaryManagers);
        System.out.println("--------------------------------------------------");

        //Highest salary
        Optional<Employee> highestSalary = employees.stream().max((employee1, employee2) -> (int) (employee1.getSalary() - employee2.getSalary()));
        System.out.println(highestSalary.get().getSalary());

    }
}
