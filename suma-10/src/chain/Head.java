package chain;

/**
 * @author Milla
 */

class Head extends Handler {
    
    private double max = 5.0;

    public Head(Handler s) {
        super(s);
    }
    
    public void handle(PayRequest r) {        
        if (r.getRequest() <= max) {            
            System.out.println("Your request was " + r.getRequest() + "%. Head of Department has handled your request.");        
        } else {            
            super.handle(r);        
        }    
    }

}
