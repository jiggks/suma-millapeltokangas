package visitor;

/**
 * @author Milla
 */

public class Main {
    public static void main(String[] args) {
        Connection c = new Connection();
        Visitor v = new XAttackVisitor();
        
        c.tackle();
        c.accept(v);
        c.vineWhip();
        c.razorLeaf();
        c.accept(v);
        c.worrySeed();
        c.petalBlizzard();
        c.solarBeam();
        c.accept(v);
    }
}
