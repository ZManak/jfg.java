import machine.Machine;

//Create a Machine object and print its properties

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.setId(1);
        machine.setManufacturer("Samsung");
        machine.setModel("X123");
        machine.setConsumption(100);
        machine.setColor("Black");
        //String color = machine.getColor();
        machine.print();
    }
}
