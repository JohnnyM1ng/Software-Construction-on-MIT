package Tutorials;

public class whatIsAnInterface {
    public static void main(String[] args) {

    }
}

interface Bicycle_ {
    void changeCadence(int newCadence);
    void changeGear(int newGear);
}
class ACMEBicycle implements Bicycle_{
    int cadence = 0;
    int gear = 0;


    public void changeCadence(int newCadence){
        cadence = newCadence;
    }


    public void changeGear(int newGear) {
        gear = newGear;
    }
}