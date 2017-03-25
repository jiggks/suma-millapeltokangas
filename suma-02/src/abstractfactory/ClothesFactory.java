package abstractfactory;

/**
 * @author Milla
 */

public interface ClothesFactory {
    
    public abstract Trousers makeTrousers();
    public abstract Shirt makeShirt();
    public abstract Cap makeCap();
    public abstract Shoes makeShoes();

}
