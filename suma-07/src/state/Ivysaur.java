package state;

/**
 * @author Milla
 */

public class Ivysaur extends State {
    
    private Ivysaur() {
    }
    
    private final static Ivysaur INSTANCE = new Ivysaur();
    
    public static Ivysaur getInstance() {
        return INSTANCE;
    }
    
    void razorLeaf(Connection c) {
        System.out.println("Ivysaur used Razor Leaf!");
        System.out.println("");
    }
    
    void worrySeed(Connection c) {
        System.out.println("Ivysaur used Worry Seed!");
        System.out.println("");
        System.out.println("What?");
        System.out.println("Ivysaur is evolving!");
        System.out.println("");
        System.out.println("Ivysaur evolved into Venusaur.");
        changeState(c, Venusaur.getInstance());
    }
    
}
