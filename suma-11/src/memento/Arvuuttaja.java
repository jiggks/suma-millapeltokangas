package memento;

/**
 * @author Milla
 */

public class Arvuuttaja {

    public Object liityPeliin() {
        return new Memento();
    }
    
    public boolean arvaa(Object o, int r) {
        Memento m = (Memento) o;
        if (r == m.luku) {
            return true;
        } else {
            return false;
        }
    }
    
    private class Memento {
        private int luku;
    
        public Memento() {
            luku = 2;
        }
    }
}
