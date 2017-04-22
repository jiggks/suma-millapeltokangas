package visitor;

/**
 * @author Milla
 */

public class Connection {

    private State state;
    
    public Connection() {
        state = Bulbasaur.getInstance();
    }
    
    protected void changeState(State state) {
        this.state = state;
    }
    
    public void tackle() {
        state.tackle(this);
    }
    public void vineWhip() {
        state.vineWhip(this);
    }
    public void razorLeaf() {
        state.razorLeaf(this);
    }
    public void worrySeed() {
        state.worrySeed(this);
    }
    public void petalBlizzard () {
        state.petalBlizzard(this);
    }
    public void solarBeam() {
        state.solarBeam(this);
    }
    public void accept(Visitor v) {
        state.accept(v);
    }
}
