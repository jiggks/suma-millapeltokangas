package decorator;

/**
 * @author Milla
 */

public class Katkarapu extends Pizzatayte {
    private int hinta = 3;

    public Katkarapu(Pizza taytettavaPizza) {
        super(taytettavaPizza);
    }
    
    @Override
    public int getHinta() {
        return super.getHinta() + hinta;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", katkarapu";
    }
}
