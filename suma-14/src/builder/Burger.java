package builder;

import java.util.List;

/**
 * @author Milla
 */

public class Burger {
    private String bun = "";
    private String cheese = "";
    private String sauce = "";
    private String patty = "";
    List<String> stuff;
    
    public Burger() {
    }
    
    public Burger(List stuff) {
        this.stuff = stuff;
    }
    
    public void setBun(String bun) {
        this.bun = bun;
    }
    
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    
    public void setPatty(String patty) {
        this.patty = patty;
    }
    
    @Override
    public String toString() {
        if (stuff == null) {
            return "" + bun + ", " + cheese + ", " + sauce + ", " + patty;
        } else {
            return stuff.toString();
        }
    }
}
