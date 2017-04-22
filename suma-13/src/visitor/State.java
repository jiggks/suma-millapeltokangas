package visitor;

/**
 * @author Milla
 */

abstract class State {
        
        void tackle(Connection c) {}
        void vineWhip(Connection c) {}
        void razorLeaf(Connection c) {}
        void worrySeed(Connection c) {}
        void petalBlizzard (Connection c) {}
        void solarBeam(Connection c) {}
        
        void changeState(Connection c, State s) {
            c.changeState(s);
        }
        
        void accept(Visitor v) {}
}
