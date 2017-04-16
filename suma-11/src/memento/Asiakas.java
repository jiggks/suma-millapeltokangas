package memento;

/**
 * @author Milla
 */

public class Asiakas {
    private Object o;
    
    public void liityPeliin(Arvuuttaja a) {
        this.o = a.liityPeliin();
    }
    
    public void arvaa(Arvuuttaja a, int r) {
        if (a.arvaa(o, r)) {
            System.out.println("Arvasit oikein!");
        } else {
            System.out.println("Arvasit väärin.");
        }
    }
}
