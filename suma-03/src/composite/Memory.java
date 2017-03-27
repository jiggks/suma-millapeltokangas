package composite;

/**
 * @author Milla
 */

public class Memory implements Component {
    private int price;
    
    public Memory(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void addComponent(Component c) {
        throw new RuntimeException("Cannot add components to simple components.");
    }

}
