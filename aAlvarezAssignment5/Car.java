// package aAlvarezAssignment5;
public class Car {
    private int id;
    private int powerSource;
    private float pricePerDay;

    Car(int id, int powerSource, float pricePerDay){
        this.id= id;
        this.powerSource= powerSource;
        this.pricePerDay= pricePerDay;
    }

    Car(){
        id= 0;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id= id;
    }

    public int getPowerSource(){
        return powerSource;
    }

    public void setPowerSource(int powerSource){
        this.powerSource= powerSource;
    }

    public float getPricePerDay(){
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay){
        this.pricePerDay= pricePerDay;
    }

    public String toString(){
        return "\nCar ID: " + id + "\nPower Source: " + powerSource + "\nPrice Per Day: " + pricePerDay;
    }
}

