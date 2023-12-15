import persona.Person;

public class Main {
    public static void main(String[] args) {

        Person person0 = new Person(1, "John", 30, "125 Elm St", "1234567890");
        Person person1 = new Person(2, "Jane", 21, "123 Square St", "1234567890");
        Person person2 = new Person(3, "Joe", 22, "124 Moon St", "1234567890");
        Person person3 = new Person(4, "Jill", 33, "123 Lake St", "1234567890");
        Person person4 = new Person(5, "Jack", 24, "127 Oak St", "1234567890");

        Person[] people = {person0, person1, person2, person3, person4};

        for (Person person : people) {
            System.out.println("Name: " + person.name + "\nAge: " + person.age + "\n***************");
        }

        person0.name = "John Smith";
        person1.name = "Jane Smith";
        System.out.println("People after name change: ");
        System.out.println("Name: " + person0.getName() + "\nAge: " + person0.getAge() + "\n***************");
        System.out.println("Name: " + person1.name + "\nAge: " + person1.age + "\n***************");

        System.out.println("\nPeople over 30: ");
        for (Person person : people) {
            if (person.age > 30) {
                System.out.println("Name: " + person.name + "\nPhone: " + person.phone + "\n ***************");
            }
        }
    }
}
