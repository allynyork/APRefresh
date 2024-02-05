public class Droid {
    // instance fields
    String name;
    int batteryLevel;

    // methods
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }
    // String parameter, no return
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        // each task reduces battery level by 10
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport() {
        System.out.println(name + "'s battery level is: " + batteryLevel);
    }

    // takes both droids as parameters and the amount of energy to be transferred between them
    static void energyTransfer(Droid receivingDroid, Droid donatingDroid, int amount) {
        if (amount > donatingDroid.batteryLevel) {
            System.out.println(donatingDroid.name + " does not have sufficient battery level for that transfer request");
            return;
        }
        System.out.println("Commencing energy transfer of " + amount + " from " + donatingDroid.name + " to " + receivingDroid.name);
        receivingDroid.batteryLevel+=amount;
        donatingDroid.batteryLevel-=amount;
    }

    // constructor
    public Droid (String droidName) {
        name = droidName;
        // each new droid starts with a battery level of 100
        batteryLevel = 100;
    }

    // main method
    public static void main(String args[]) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("feeding the cat");
        codey.energyReport();
        Droid r2 = new Droid("R2D2");
        r2.energyReport();
        r2.performTask("skating");
        r2.performTask("running");
        r2.performTask("rolling");
        r2.energyReport();
        // call energyTransfer method with receiving droid, donating droid, and amount
        energyTransfer(r2, codey, 25);
        r2.energyReport();
        codey.energyReport();
    }
}
