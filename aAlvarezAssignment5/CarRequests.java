// package aAlvarezAssignment5;

public class CarRequests {
    private Queue<Integer> types;
    CarRequests(){
        this.types= new Queue<Integer>();
    }

    public void addRequest(Integer x){
        types.enqueue(x);
    }

    public Integer getRequest(){
        return types.dequeue();
    }

    public boolean hasPendingRequests(){
        return types.isEmpty();
    }
}