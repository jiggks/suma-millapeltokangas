package builder;

/**
 * @author Milla
 */

public class Main {
    public static void main(String[] args) {
        Waiter w = new Waiter();
        BurgerBuilder mc = new McDonaldsBuilder();
        BurgerBuilder he = new HesburgerBuilder();
        
        w.setBurgerBuilder(mc);
        w.constructBurger();
        
        Burger mcBurger = w.getBurger();
        
        w.setBurgerBuilder(he);
        w.constructBurger();
        
        Burger heBurger = w.getBurger();
        
        System.out.println(mcBurger);
        System.out.println(heBurger);
    }
}
