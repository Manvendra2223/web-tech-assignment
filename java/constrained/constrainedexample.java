// This class demonstrates Constrained Property
// It restricts property changes using validation

package constrained;

import java.beans.*;

public class ConstrainedExample {
    private int age;

    // Support for vetoable change
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    // Add listener
    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    // Setter method with validation
    public void setAge(int newAge) throws PropertyVetoException {

        // Condition: age must be 18 or above
        if (newAge < 18) {
            throw new PropertyVetoException("Age must be 18+", null);
        }

        this.age = newAge;
    }
}