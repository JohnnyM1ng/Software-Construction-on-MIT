package Tutorials;

public class whatIsClass {
    public static void main(String args[]){

        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle1.changeCadence(50);
        bicycle1.changeGear(4);
        bicycle1.printStates();
    }
}

class Bicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

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