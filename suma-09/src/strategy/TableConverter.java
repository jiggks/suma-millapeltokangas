package strategy;

import java.util.List;

/**
 * @author Milla
 */

public class TableConverter implements ListConverter {
    
    public void listToString(List l) {
        String[] sl = new String[l.size()];
        for (int i = 0; i < l.size(); i++) {
            sl[i] = (String)l.get(i);
        }
        for (int a = 1; a <= sl.length; a++) {
            System.out.print(sl[a-1] + " ");
            if (a%2 == 0) {
                System.out.print("\n");
            }
        }
    }
}
