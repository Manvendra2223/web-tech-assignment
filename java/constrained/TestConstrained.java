package constrained;

import java.beans.*;

public class TestConstrained {
    public static void main(String[] args) {

        ConstrainedExample obj = new ConstrainedExample();

        try {
            obj.setAge(20);
            System.out.println("Age set to 20");

            obj.setAge(15); // ये error देगा
        } catch (PropertyVetoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}