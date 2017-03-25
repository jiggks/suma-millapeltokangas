package abstractfactory;

/**
 *
 * @author Milla
 */
public class BossFactory implements ClothesFactory {
    
    public Trousers makeTrousers() {
        return new BossTrousers();
    }
    
    public Shirt makeShirt() {
        return new BossShirt();
    }
    
    public Cap makeCap() {
        return new BossCap();
    }
    
    public Shoes makeShoes() {
        return new BossShoes();
    }
}
