package models;

public class Call {
    private String name;
    private String number;

    public Call() {
    }

    public Call(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Call{" + "name=" + name + ", number=" + number + '}';
    }


}
