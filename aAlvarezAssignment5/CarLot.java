// package aAlvarezAssignment5;


import java.util.LinkedList;

public class CarLot{
    private Queue<Car> gasolineLot;
    private Queue<Car> hybridLot;
    private Queue<Car> electricLot;

    CarLot(){
        this.gasolineLot= new Queue<Car>();
        this.hybridLot= new Queue<Car>();
        this.electricLot= new Queue<Car>();
    }

    public boolean addCar(Car x){
        int power= x.getPowerSource();
        if (power==1){
            gasolineLot.enqueue(x);
            return true;
        } else if(power==2){
            hybridLot.enqueue(x);
            return true;
        }else if(power==3){
            electricLot.enqueue(x);
            return true;
        }else{
            return false;
        }
    }

    public LinkedList<Car> processRequests(CarRequests requests){
        LinkedList<Car> processedRequest= new LinkedList<Car>();
        Integer gas= 1;
        Integer hybrid= 2;
        Integer electric= 3;
        while (requests.hasPendingRequests()==false){
            Integer current = requests.getRequest();
            if(current.equals(gas)){
                if(gasolineLot.isEmpty()){
                    processedRequest.add(new Car());
                }else{
                    processedRequest.add(gasolineLot.dequeue());
                }
            }else if(current.equals(hybrid)){
                if(hybridLot.isEmpty()){
                    processedRequest.add(new Car());
                }else{
                    processedRequest.add(hybridLot.dequeue());
                }
            }else if(current.equals(electric)){
                if (electricLot.isEmpty()){
                    processedRequest.add(new Car());
                }else{
                    processedRequest.add(electricLot.dequeue());
                }
            }
        }
        return processedRequest;
    }
    // public static void main(String[] args){
    //     CarLot test= new CarLot();
    //     Car gas1= new Car(1,1,1);
    //     Car gas2=new Car(2,1,2);
    //     Car hybrid1= new Car(3,2,1);
    //     Car hybrid2= new Car(4,2,2);
    //     Car electric1= new Car(5,3,1);
    //     Car electric2= new Car(6,3,2);
    //     test.addCar(gas1);
    //     test.addCar(gas2);
    //     test.addCar(hybrid1);
    //     test.addCar(hybrid2);
    //     test.addCar(electric1);
    //     test.addCar(electric2);
    //     CarRequests r= new CarRequests();
    //     r.addRequest(1);
    //     r.addRequest(1);
    //     r.addRequest(1);
    //     r.addRequest(2);
    //     r.addRequest(3);
    //     System.out.println(test.processRequests(r));
    // }
}


