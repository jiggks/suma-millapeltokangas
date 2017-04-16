package chain;

/**
 * @author Milla
 */

public abstract class Handler {
    private Handler s;
    
    public Handler(Handler s){
        this.s = s;
    }
    
    public void handle(PayRequest r) {
        if (s != null) {
            s.handle(r);
        }
    }
}
