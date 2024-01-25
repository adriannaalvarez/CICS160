// package aAlvarezAssignment5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class QueueTests {

    @Test
    public void dequeueTestWithOne(){
        Queue<Integer> q= new Queue<Integer>();
        Integer test= 1;
        q.enqueue(test);
        assertEquals(test,q.dequeue());
    }

    @Test
    public void dequeueTestWithMultiple(){
        Queue<Integer> q= new Queue<Integer>();
        Integer test1= 1;
        Integer test2= 2;
        Integer test3= 3;
        q.enqueue(test1);
        q.enqueue(test2);
        q.enqueue(test3);
        assertEquals(test1,q.dequeue());
    }

    @Test
    public void peekTestWithOne(){ 
        Queue<Integer> q= new Queue<Integer>();
        Integer test= 1;
        q.enqueue(test);
        assertEquals(test,q.peek());
    }

    @Test
    public void peekTestWithMultiple(){ 
        Queue<Integer> q= new Queue<Integer>();
        Integer test1= 1;
        Integer test2= 2;
        Integer test3= 3;
        q.enqueue(test1);
        q.enqueue(test2);
        q.enqueue(test3);
        assertEquals(test1,q.peek());
    }

    @Test
    public void isEmptyTestWithEmpty(){
        Queue<Integer> q= new Queue<Integer>();
        assertEquals(true,q.isEmpty());
    }

    @Test
    public void isEmptyTestNotEmpty(){
        Queue<Integer> q= new Queue<Integer>();
        Integer test= 1;
        q.enqueue(test);
        assertEquals(false,q.isEmpty());
    }
}
