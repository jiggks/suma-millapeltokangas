package builder;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Milla
 */

public class HesburgerBuilder extends BurgerBuilder {
    
    List<String> stuff = new LinkedList<String>();
    
    public void createNewBurger() {
        burger = new Burger(stuff);
    }

    public void buildBun() {
        burger.stuff.add("basic bun");
    }

    public void buildCheese() {
        burger.stuff.add("pepper jack cheese");
    }

    public void buildSauce() {
        burger.stuff.add("bbq sauce");
    }
    
    public void buildPatty() {
        burger.stuff.add("one chicken patty");
    }

}
