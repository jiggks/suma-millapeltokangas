package decorator;

/**
 * @author Milla
 */

public class Ananas extends Pizzatayte {
    private int hinta = 2;

    public Ananas(Pizza taytettavaPizza) {
        super(taytettavaPizza);
    }
    
    @Override
    public int getHinta() {
        return super.getHinta() + hinta;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", ananas";
    }
}
