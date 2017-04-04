package decorator;

/**
 * @author Milla
 */

public class Main {
    public static void main(String[] args) {
        Pizza margerita = new Juusto(new Pizzapohja());
        Pizza hawaii = new Ananas(new Kinkku(new Pizzapohja()));
        Pizza fantasia = new Kinkku(new Katkarapu(new Juusto(new Pizzapohja())));
        
        System.out.println("Margerita: " + margerita.getDescription() + " | Hinta: " + margerita.getHinta() + " e");
        System.out.println("Hawaii: " + hawaii.getDescription() + " | Hinta: " + hawaii.getHinta() + " e");
        System.out.println("Fantasia: " + fantasia.getDescription() + " | Hinta: " + fantasia.getHinta() + " e");
    }
}
