package aAlvarezAssignment4;

class Car {
    private String makeAndModel;
    private int maximumNumberOfPassengers;
    private int numberOfDoors;
    Car(String makeAndModel, int maximumNumberOfPassengers, int numberOfDoors){
        this.makeAndModel= makeAndModel;
        this.maximumNumberOfPassengers= maximumNumberOfPassengers;
        this.numberOfDoors= numberOfDoors;
    }
    Car(){
        this.makeAndModel= "not assigned";
        this.maximumNumberOfPassengers= 2;
        this.numberOfDoors= 2;
    }

    public void setMakeAndModel(String m){
        this.makeAndModel= m;
    }

    public String getMakeAndModel(){
        return makeAndModel;
    }

    public void setMaximumNumberOfPassengers(int m){
        this.maximumNumberOfPassengers= m;
    }

    public int getMaximumNumberOfPassengers(){
        return maximumNumberOfPassengers;
    }

    public void setNumberOfDoors(int m){
        this.numberOfDoors= m;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    public String toString(){
        return "Make and Model: " + makeAndModel + "\nMaximum Number of Passengers: " + maximumNumberOfPassengers + "\nNumber of Doors: " + numberOfDoors;
    }

    }

