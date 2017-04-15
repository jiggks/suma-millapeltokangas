package strategy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Milla
 */

public class Main {
    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        
        l.add("Amanda");
        l.add("Benjamin");
        l.add("Cody");
        l.add("Damien");
        l.add("Emma");
        l.add("Farha");
        l.add("George");
        l.add("Harry");
        
        ListConverter it = new IteratorConverter();
        it.listToString(l);
        System.out.println("");
        
        ListConverter ta = new TableConverter();
        ta.listToString(l);
        System.out.println("");
        
        ListConverter ge = new GetConverter();
        ge.listToString(l);
        System.out.println("");
    }
}
