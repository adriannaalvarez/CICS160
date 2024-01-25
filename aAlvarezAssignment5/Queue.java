// package aAlvarezAssignment5;

import java.util.LinkedList;
public class Queue<T> {
    private LinkedList<T> queue;
    private int size;

    Queue(){
        this.queue= new LinkedList<T>();
        this.size= 0;
    }

    public void enqueue(T e){
        queue.add(e);
        size+=1;
    }

    public T dequeue(){
        size= size-1;
        return queue.remove(0);
    }

    public T peek(){
        return queue.getFirst();
    }

    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }

}


