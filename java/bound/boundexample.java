import java.beans.*;

public class BoundExample {
    private String name;
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    public void setName(String newName) {
        String oldName = this.name;
        this.name = newName;
        pcs.firePropertyChange("name", oldName, newName);
    }
}