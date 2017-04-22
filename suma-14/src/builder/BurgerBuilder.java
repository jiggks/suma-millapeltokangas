package builder;

/**
 * @author Milla
 */

public abstract class BurgerBuilder {
    
    protected Burger burger;
    
    public Burger getBurger() {
        return burger;
    }
    
    public abstract void createNewBurger();
    public abstract void buildBun();
    public abstract void buildCheese();
    public abstract void buildSauce();
    public abstract void buildPatty();
}
