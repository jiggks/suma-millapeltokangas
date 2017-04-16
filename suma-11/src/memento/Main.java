package memento;

/**
 * @author Milla
 */

public class Main {
    public static void main(String[] args) {
        Asiakas a = new Asiakas();
        Arvuuttaja b = new Arvuuttaja();
        
        a.liityPeliin(b);
        a.arvaa(b, 4);
        a.arvaa(b, 6);
        a.arvaa(b, 2);
    }
}
