package visitor;

/**
 * @author Milla
 */

public class XAttackVisitor implements Visitor {

    public void visit(Bulbasaur b) {
        b.setAtk(b.getAtk()+1);
        System.out.println("Attack raised to " + b.getAtk());
    }

    public void visit(Ivysaur i) {
        i.setAtk(i.getAtk()+2);
        System.out.println("Attack raised to " + i.getAtk());
    }

    public void visit(Venusaur v) {
        v.setAtk(v.getAtk()+4);
        System.out.println("Attack raised to " + v.getAtk());
    }
    
}
