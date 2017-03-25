package abstractfactory;

/**
 * @author Milla
 */

public class AdidasFactory implements ClothesFactory {

    public Trousers makeTrousers() {
        return new AdidasTrousers();
    }

    public Shirt makeShirt() {
        return new AdidasShirt();
    }

    public Cap makeCap() {
        return new AdidasCap();
    }

    public Shoes makeShoes() {
        return new AdidasShoes();
    }

}
