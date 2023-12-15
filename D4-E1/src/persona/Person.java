package persona;
//Create a class Person, which has the following attributes: id, name, age, address, and phone number (consider all its attributes, constructors, and getter and setter methods).
public class Person {
    public int id;
    public String name;
    public int age;
    public String address;
    public String phone;

    public Person(){

    }

    public Person(int id, String name, int age, String address, String phone){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
