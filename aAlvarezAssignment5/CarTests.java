// package aAlvarezAssignment5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CarTests {
    @Test
    public void constructorTest(){
        Car test= new Car(1,1,1f);
        assertEquals(test.getId(), 1);
        assertEquals(test.getPowerSource(), 1);
        assertEquals(test.getPricePerDay(),1.00f,0.1);
    }

    @Test
    public void getIdTest(){
        Car test= new Car();
        test.setId(1);
        assertEquals(1,test.getId());
    }
    @Test
    public void getPowerSourceTest(){
        Car test= new Car();
        test.setPowerSource(1);
        assertEquals(1,test.getPowerSource());
    }
    @Test
    public void getPricePerDayTest(){
        Car test= new Car();
        test.setPricePerDay(1.00f);
        assertEquals(1.00f, test.getPricePerDay(),0);
    }
}
