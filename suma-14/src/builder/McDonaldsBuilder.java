package builder;

/**
 * @author Milla
 */

public class McDonaldsBuilder extends BurgerBuilder {

    public void createNewBurger() {
        burger = new Burger();
    }
    
    public void buildBun() {
        burger.setBun("sesam seed bun");
    }

    public void buildCheese() {
        burger.setCheese("cheddar");
    }

    public void buildSauce() {
        burger.setSauce("ketchup");
    }

    public void buildPatty() {
        burger.setPatty("one beef patty");
    }

}
