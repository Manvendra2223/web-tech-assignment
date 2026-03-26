// This class demonstrates Bound Property
// It notifies listeners when property value changes

package bound;

import java.beans.*;

public class BoundExample {
    private String name;

    // Support for property change
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    // Add listener
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    // Setter method with change notification
    public void setName(String newName) {
        String oldName = this.name;
        this.name = newName;

        // Notify listeners about change
        pcs.firePropertyChange("name", oldName, newName);
    }
}