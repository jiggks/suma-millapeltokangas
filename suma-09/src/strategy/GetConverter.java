package strategy;

import java.util.List;

/**
 * @author Milla
 */

public class GetConverter implements ListConverter {
    
    public void listToString(List l) {
        for (int i = 1; i <= l.size(); i++) {
            System.out.print(l.get(i-1) + " ");
            if (i % 3 == 0) {
                System.out.print("\n");
            }
        }
    }
}
