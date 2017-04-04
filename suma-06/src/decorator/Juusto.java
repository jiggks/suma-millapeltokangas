package decorator;

/**
 * @author Milla
 */

public class Juusto extends Pizzatayte {
    private int hinta = 1;

    public Juusto(Pizza taytettavaPizza) {
        super(taytettavaPizza);
    }
    
    @Override
    public int getHinta() {
        return super.getHinta() + hinta;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", tuplajuusto";
    }
}
