package chain;

/**
 * @author Milla
 */

class CEO extends Handler {

    public CEO(Handler s) {
        super(s);
    }
    
    public void handle(PayRequest r) {
        System.out.println("Your request was " + r.getRequest() + "%. CEO has handled your request.");
    }

}
