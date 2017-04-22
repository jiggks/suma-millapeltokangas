package builder;

/**
 * @author Milla
 */

public class Waiter {
    private BurgerBuilder bb;
    
    public void setBurgerBuilder(BurgerBuilder bb) {
        this.bb = bb;
    }
    
    public Burger getBurger() {
        return bb.getBurger();
    }
    
    public void constructBurger() {
        bb.createNewBurger();
        bb.buildBun();
        bb.buildCheese();
        bb.buildSauce();
        bb.buildPatty();
    }
}
