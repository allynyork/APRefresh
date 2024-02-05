public class Store {
    // instance fields
    String productType;
    double price;
    //int inventoryCount;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
        // inventoryCount = count;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double totalPrice = price + price * 0.08;
        return  totalPrice;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // greetCustomer method
    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }
    public static void main(String[] args) {

        // create instance
        Store lemonadeStand = new Store("lemonade", 3.75);
        // Call the advertise() method on the lemonadeStand object
        lemonadeStand.advertise();

        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);

        lemonadeStand.greetCustomer("Allyn");
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);

        // print out the lemonadeStand object. the result is its position in memory
        System.out.println(lemonadeStand);
    }
    public String toString(){
        return "This store sells " + productType + " at a price of " + price;
    }
}
