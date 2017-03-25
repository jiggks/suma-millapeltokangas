package abstractfactory;

/**
 *
 * @author Milla
 */
public class Clothes {
    
    Trousers trousers;
    Shirt shirt;
    Cap cap;
    Shoes shoes;
    
    public Clothes(ClothesFactory factory) {
        trousers = factory.makeTrousers();
        shirt = factory.makeShirt();
        cap = factory.makeCap();
        shoes = factory.makeShoes();
    }
    
    public void pue() {
        System.out.println("Hei, olen Jasper Java-koodaaja ja minulla on päälläni:");
        System.out.println("- " + trousers);
        System.out.println("- " + shirt);
        System.out.println("- " + cap);
        System.out.println("- " + shoes);
    }

}
