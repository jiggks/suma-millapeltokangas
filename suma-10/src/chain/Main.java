package chain;

/**
 * @author Milla
 */

public class Main {
    public static void main(String[] args) {
        Handler h = new Manager(new Head(new CEO(null)));
        
        PayRequest s = new PayRequest(1.5);
        PayRequest m = new PayRequest(2.7);
        PayRequest l = new PayRequest(5.2);
        
        h.handle(s);
        System.out.println("");
        h.handle(m);
        System.out.println("");
        h.handle(l);
        System.out.println("");
    }
}
