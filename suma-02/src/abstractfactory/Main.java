package abstractfactory;

/**
 * @author Milla
 */

public class Main {
    public static void main(String[] args) {
        Clothes adidas = new Clothes(new AdidasFactory());
        adidas.pue();
        
        System.out.println("");
        
        Clothes boss = new Clothes(new BossFactory());
        boss.pue();
    }
}
