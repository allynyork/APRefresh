public class Bakery {
    // instance fields
    Cupcake bakeryCupcake;
    double price;
    String giveTotal;

    // constructor
    // takes another object as a parameter
    public Bakery(Cupcake cupcakeType, double priceOf) {
        // Create a copy Cupcake object
        Cupcake copy = new Cupcake(cupcakeType);
        // set bakeryCupcake to hold value of object copy
        bakeryCupcake = copy;
        price = priceOf;
        bakeryCupcake.flavor = "vanilla";
        giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;
    }

    public static void main(String[] args) {
        // create instance of a Cupcake
        Cupcake chocolateSprinkle = new Cupcake("chocolate", true);
        // create instance of Bakery which will use instance of Cupcake object
        Bakery myBakery = new Bakery(chocolateSprinkle, 3.25);
        System.out.println(myBakery.giveTotal);

        // Output a value of parameter object
        System.out.println("Our object sent as a parameter has a flavor value of "  + myBakery.bakeryCupcake.flavor);
        // Output a value of original object
        System.out.println("Our original object has a flavor value of " + chocolateSprinkle.flavor);
    }
}

// state is represented with instance fields, and behaviour is represented with methods
