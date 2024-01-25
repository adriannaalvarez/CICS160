package aAlvarezAssignment4;

public class ElectricCar extends Car{
    private double batterySize;

    ElectricCar(String makeAndModel, int maximumNumberOfPassengers, int numberOfDoors, double batterySize){
        super(makeAndModel, maximumNumberOfPassengers, numberOfDoors);
        this.batterySize= batterySize;
}
    public void setBatterySize(double b){
        this.batterySize= b;
    }

    public double getBatterySize(){
        return batterySize;
    }

    public String toString(){
        return (super.toString() + "\nBattery Size: " + batterySize);
    }
}
