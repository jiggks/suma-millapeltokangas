package visitor;

/**
 * @author Milla
 */

class Bulbasaur extends State {
    
    private int atk = 1;

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
    
    private Bulbasaur() {
    }
    
    private final static Bulbasaur INSTANCE = new Bulbasaur();
    
    public static Bulbasaur getInstance() {
        return INSTANCE;
    }
    
    void tackle(Connection c) {
        System.out.println("Bulbasaur used Tackle!");
        System.out.println("");
    }
    
    void vineWhip (Connection c) {
        System.out.println("Bulbasaur used Vine Whip!");
        System.out.println("");
        System.out.println("What?");
        System.out.println("Bulbasaur is evolving!");
        System.out.println("");
        System.out.println("Bulbasaur evolved into Ivysaur.");
        changeState(c, Ivysaur.getInstance());
    }
    
    void accept(Visitor v) {
        v.visit(this);
    }
}