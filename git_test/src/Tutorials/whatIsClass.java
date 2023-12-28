package Tutorials;

public class whatIsClass {
    public static void main(String args[]){

        Bicycle bicycle1 = new Bicycle(1, 2, 3);
        Bicycle bicycle2 = new Bicycle();
        Bicycle bicycle3 = new Bicycle(1,3);
//        Bicycle bicycle2 = new Bicycle();
        bicycle1.changeCadence(50);
        bicycle1.changeGear(4);
        bicycle1.printStates();
        bicycle2.printStates();
        bicycle3.printStates();
    }
}

class Bicycle{
    public int cadence;
    public int speed;
    public int gear;
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public Bicycle(int startCadence, int startSpeed) {
        gear = 444;
        cadence = startCadence;
        speed = startSpeed;
    }


    public Bicycle() {
        gear = 11;
        cadence = 22;
        speed = 33;
    }
    void changeCadence(int newCadence){
        cadence = newCadence;
    }

    void changeGear(int newGear){
        gear = newGear;
    }

    void speedUp(int increment){
        speed += increment;
    }

    void applyBrake(int decrement){
        speed -= decrement;
    }

    void printStates(){
        System.out.println("cadence:" + cadence
                            + " speed:" + speed
                            + " gear:" + gear);
    }

}