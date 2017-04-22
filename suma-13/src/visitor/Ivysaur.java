package visitor;

/**
 * @author Milla
 */

public class Ivysaur extends State {
    
    private int atk = 3;
    
    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
    
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
    
    void accept(Visitor v) {
        v.visit(this);
    }
    
}
