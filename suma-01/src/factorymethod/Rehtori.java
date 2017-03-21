package factorymethod;

/**
 * @author Milla
 */

public class Rehtori extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Vesi();
    }
}
