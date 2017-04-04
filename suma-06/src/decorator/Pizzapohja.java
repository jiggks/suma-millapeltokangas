package decorator;

/**
 * @author Milla
 */

public class Pizzapohja implements Pizza {
    private int hinta = 3;
    
    public int getHinta() {
        return hinta;
    }
    
    public String getDescription() {
        return "Pizzapohja (sisältää tomaattikastikkeen ja juuston)";
    }
}
