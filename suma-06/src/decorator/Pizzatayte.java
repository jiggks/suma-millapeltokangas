package decorator;

/**
 * @author Milla
 */

public abstract class Pizzatayte implements Pizza {
    protected Pizza taytettavaPizza;
    
    public Pizzatayte(Pizza taytettavaPizza) {
        this.taytettavaPizza = taytettavaPizza;
    }
    
    public int getHinta() {
        return taytettavaPizza.getHinta();
    }
    
    public String getDescription() {
        return taytettavaPizza.getDescription();
    }
}
