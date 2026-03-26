package constrained;
import java.beans.*;

public class ConstrainedExample {
    private int age;
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    public void setAge(int newAge) throws PropertyVetoException {
        if (newAge < 18) {
            throw new PropertyVetoException("Age must be 18+", null);
        }
        this.age = newAge;
    }
}