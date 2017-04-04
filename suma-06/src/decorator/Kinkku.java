package decorator;

/**
 * @author Milla
 */

public class Kinkku extends Pizzatayte {
    private int hinta = 2;

    public Kinkku(Pizza taytettavaPizza) {
        super(taytettavaPizza);
    }
    
    @Override
    public int getHinta() {
        return super.getHinta() + hinta;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", kinkku";
    }
}
