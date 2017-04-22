package visitor;

/**
 * @author Milla
 */

public class Venusaur extends State {
    
    private int atk = 5;
    
    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
    
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
    
    void accept(Visitor v) {
        v.visit(this);
    }
}
