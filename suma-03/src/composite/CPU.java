package composite;

/**
 * @author Milla
 */

public class CPU implements Component {
    private int price;
    
    public CPU(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void addComponent(Component c) {
        throw new RuntimeException("Cannot add components to simple components.");
    }
}
