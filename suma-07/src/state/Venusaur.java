package state;

/**
 * @author Milla
 */

public class Venusaur extends State {
    
    private Venusaur() {
    }
    
    private final static Venusaur INSTANCE = new Venusaur();
    
    public static Venusaur getInstance() {
        return INSTANCE;
    }
    
    void petalBlizzard(Connection c) {
        System.out.println("Venusaur used Petal Blizzard!");
        System.out.println("");
    }
    
    void solarBeam(Connection c) {
        System.out.println("Venusaur used Solar Beam!");
        System.out.println("");
    }
}
