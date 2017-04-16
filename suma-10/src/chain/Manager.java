package chain;

/**
 * @author Milla
 */

class Manager extends Handler {

    private double max = 2.0;

    public Manager(Handler s) {
        super(s);
    }

    public void handle(PayRequest r) {
        if (r.getRequest() <= max) {
            System.out.println("Your request was " + r.getRequest() + "%. Manager has handled your request.");
        } else {
            super.handle(r);
        }
    }

}
