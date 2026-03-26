package bound;

import java.beans.*;

public class TestBound {
    public static void main(String[] args) {

        BoundExample obj = new BoundExample();

        obj.addPropertyChangeListener(evt -> {
            System.out.println("Property changed: " + evt.getOldValue() + " → " + evt.getNewValue());
        });

        obj.setName("Mannu");
        obj.setName("Rahul");
    }
}