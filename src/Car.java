public class Car {
    // instance fields
    String color;

    // constructor method
    public Car(String carColor) {
        color = carColor;
    }

    // Method 1
    public void startRadio(double stationNum, String stationName) {
        System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
        System.out.println("Enjoy!");
    }

    // Method 2, note that this is an overloaded method
    public void startRadio(double stationNum) {
        System.out.println("Turning on the radio to " + stationNum + "!");
    }

    public static void main(String[] args){
        Car myCar = new Car("red");
        // Calls the first startRadio() method
        myCar.startRadio(103.7, "Meditation Station");

        // Calls the second startRadio() method
        myCar.startRadio(98.2);

        // print Car object, which is the reference to its position in memory
        System.out.println(myCar);

    }
    // use the toString method which tells us about the Car object
    public String toString(){
        return "This is a " + color + " car!";
    }
}
