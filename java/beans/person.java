// This class represents a simple JavaBean (Person)
// It contains private properties with getter and setter methods

package beans;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    // Default constructor
    public Person() {}

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}