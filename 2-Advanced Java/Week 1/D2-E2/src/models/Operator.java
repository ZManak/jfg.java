package models;

public class Operator implements Runnable{
    private String name;

    public Operator(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void assemble() {
        System.out.println(this.getName() + " assembling...");
    }

    public void test() {
        System.out.println(this.getName() + " testing...");
    }

    public void pack() {
        System.out.println(this.getName() + " packing...");
    }

    @Override
    public void run() {
        this.assemble();
        this.test();
        this.pack();
    }
}
