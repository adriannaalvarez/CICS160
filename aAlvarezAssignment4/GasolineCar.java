package aAlvarezAssignment4;

public class GasolineCar extends Car{
    private double gasTankSize;
    GasolineCar(String makeAndModel, int maximumNumberOfPassengers, int numberOfDoors,double gasTankSize){
        super(makeAndModel,maximumNumberOfPassengers,numberOfDoors);
        this.gasTankSize= gasTankSize;
}

    GasolineCar(){
        super();
        this.gasTankSize= -1;
    }

    public void setGasTankSize(double g){
        this.gasTankSize= g;
    }

    public double getGasTankSize(){
        return gasTankSize;
    }

    public String toString(){
        return (super.toString() + "\nGas Tank Size: " + gasTankSize);
    }
}

