package composite;

/**
 * @author Milla
 */

public class Main {
    
    public static void main(String[] args) {
        
        Component newCase = new Case(80);
        Component hardDisk = new HDD(49);
        newCase.addComponent(hardDisk);
        
        System.out.println("Case and components: " + newCase.getPrice());
        System.out.println("");
        
        Component motherBoard = new Motherboard(155);
        Component graphicP = new GPU(529);
        motherBoard.addComponent(graphicP);
        Component ramOne = new Memory(20);
        Component ramTwo = new Memory(20);
        motherBoard.addComponent(ramOne);
        motherBoard.addComponent(ramTwo);
        
        System.out.println("Motherboard and components: " + motherBoard.getPrice());
        System.out.println("");
        
        Component processor = new CPU(239);
        motherBoard.addComponent(processor);
        newCase.addComponent(motherBoard);
        
        System.out.println("Motherboard and components: " + motherBoard.getPrice());
        System.out.println("Case and components: " + newCase.getPrice());
        
        ramOne.addComponent(ramTwo);
        
    }
}
