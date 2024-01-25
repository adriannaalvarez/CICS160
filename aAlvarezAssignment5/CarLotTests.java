import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.LinkedList;


public class CarLotTests {
    @Test
    public void addCarTestTrue(){
        CarLot test= new CarLot();
        assertEquals(true, test.addCar(new Car(0,1,0)));
    }
    @Test
    public void addCarTestFalse(){
        CarLot test= new CarLot();
        assertEquals(false, test.addCar(new Car(0,5,0)));
    }

    @Test
    public void processRequestsTestWithEnoughCars(){
        CarLot test= new CarLot();
        Car car1= new Car(1,1,1);
        Car car2= new Car(2,2,2);
        Car car3= new Car(3,3,3);
        test.addCar(car1);
        test.addCar(car2);
        test.addCar(car3);
        CarRequests requests= new CarRequests();
        requests.addRequest(1);
        requests.addRequest(2);
        requests.addRequest(3);
        LinkedList<Car> result= new LinkedList<Car>();
        result.add(car1);
        result.add(car2);
        result.add(car3);
        assertEquals(result,test.processRequests(requests));
    }

    @Test
    public void processRequestsTestWithNotEnoughCars(){
        CarLot test= new CarLot();
        CarRequests requests= new CarRequests();
        requests.addRequest(1);
        requests.addRequest(2);
        requests.addRequest(3);
        LinkedList<Car> actual= test.processRequests(requests);
        assertEquals(0,actual.get(0).getId());
        assertEquals(0,actual.get(1).getId());
        assertEquals(0,actual.get(2).getId());
    }
}
