// This class is used to test the Person JavaBean

import beans.Person;

public class Test {
    public static void main(String[] args) {

        // Create object of Person
        Person p = new Person();

        // Set values
        p.setName("Mannu");
        p.setAge(20);

        // Display values
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}