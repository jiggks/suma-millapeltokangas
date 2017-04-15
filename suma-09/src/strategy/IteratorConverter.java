package strategy;

import java.util.Iterator;
import java.util.List;

/**
 * @author Milla
 */

public class IteratorConverter implements ListConverter {
    
    public void listToString(List l) {
        Iterator<String> i = l.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + "\n");
        }
    }
}
