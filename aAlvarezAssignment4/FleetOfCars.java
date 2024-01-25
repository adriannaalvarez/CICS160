package aAlvarezAssignment4;
import java.util.ArrayList;
public class FleetOfCars {
   private int size;
   private ArrayList<Car> fleet;

   FleetOfCars(){
      this.fleet = new ArrayList<Car>();
      this.size = 0;
   } 

   public void add(Car c){
      this.fleet.add(c);
      this.size+=1;
   }

   public int getSize(){
      return size;
   }

   public void delete(int i){
      if (this.size==0){
         return;
      }
      this.fleet.remove(i);
      this.size-=1;
   }

   public Car get(int i){
      return this.fleet.get(i);
   }

   public FleetOfCars search(String s){
      FleetOfCars returnFleet = new FleetOfCars();
      for (Car currentElement : this.fleet){
         if (currentElement.getMakeAndModel().equals(s)){
            returnFleet.add(currentElement);
         }
      }
      return returnFleet;
   }

   public String toString(){
      String StringToReturn ="Fleet Size: " + this.size + "\n";
      for (Car currentElement : this.fleet){
         StringToReturn = StringToReturn + "\n" + currentElement.toString() + "\n";
      }
      return StringToReturn;
   }
 public static void main(String args[]){
   FleetOfCars test= new FleetOfCars();
   test.add(new Car("car1",5,4));
   test.add(new ElectricCar("car2",2,2,10.67));
   test.add(new GasolineCar("car3",10,4,30.5));
   System.out.println(test);
   test.delete(0);
   System.out.println(test);
}
}

