package models;

// position is a constant, so we can use enum
import constants.Position;

public class Employee  {
    private String name;
    private Position position;
    private double salary;


    public Employee() {
    }

    public Employee(String name, Position position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
    }


    public void setPosition(Position position) {
            this.position = position;
        }


    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return this.salary;
    }
}
