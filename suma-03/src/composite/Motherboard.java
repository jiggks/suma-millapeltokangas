package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Milla
 */

public class Motherboard implements Component{
    
    private int price;
    List <Component> cs = new ArrayList<Component>();
    
    public Motherboard(int price) {
        this.price = price;
    }

    public int getPrice() {
        int compPrice = price;
        for (Component c : cs) {
            compPrice += c.getPrice();
        }
        return compPrice;
    }

    public void addComponent(Component c) {
        cs.add(c);
    }
}
