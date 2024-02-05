public class Cupcake {
    // instance variables
    String flavor;
    boolean sprinkles;
    // constructor
    public Cupcake(String type, boolean hasSprinkles) {
        flavor = type;
        sprinkles = hasSprinkles;
    }
    // copy constructor
    public Cupcake(Cupcake copy) {
        flavor = copy.flavor;
        sprinkles = copy.sprinkles;
    }
}
