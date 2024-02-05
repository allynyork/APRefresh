public class CarLot {
    // instance variable that holds Car object
    Car carInLot;

    // constructor method
    public CarLot(Car givenCar) {
        carInLot = givenCar;
    }

    // returnACar method that returns a Car object
    public Car returnACar() {
        // return Car object
        return carInLot;
    }

    // main method
    public static void main(String[] args) {
        Car myCar = new Car("red");
        System.out.println(myCar);
        CarLot myCarLot = new CarLot(myCar);
        System.out.println(myCarLot.returnACar());
    }
}
