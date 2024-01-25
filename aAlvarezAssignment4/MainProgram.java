// // package aAlvarezAssignment4;
// import java.util.Scanner;
// public class MainProgram {
//     public static void main(String[] args){
//         boolean keepGoing= true;
//         FleetOfCars fleet= new FleetOfCars();
//         Scanner scan = new Scanner(System.in);
        
//         while (keepGoing){
//             System.out.println("\nEnter option from list below: \n1) Display complete directory \n2) Enter new Car \n3) Search for Car \n4) Modify Car information \n5) Delete a record. \nQ) Quit");
//             String x = scan.nextLine();
//             x= x.toLowerCase();
//             if(x.equals("q")){
//                 keepGoing = false;
//                 scan.close();
//             }else if(x.equals("1")){
//                 System.out.println("\n" + fleet);
//             }else if (x.equals("2")){
//                 Scanner s1 = new Scanner(System.in);
//                 System.out.println("\nWhat is the make and model of this car?");
//                 String make = s1.nextLine();
//                 System.out.println("\nWhat is the maximum number of passengers for this car?");
//                 int max= s1.nextInt();
//                 System.out.println("\nHow many doors does this car have?");
//                 int doors= s1.nextInt();
//                 fleet.add(new Car(make,max,doors));
//             }else if (x.equals("3")){
//                 Scanner s2 = new Scanner(System.in);
//                 System.out.println("\nWhat is the make and model of the car you are searching for?");
//                 String make = s2.nextLine(); 
//                 FleetOfCars s = new FleetOfCars();
//                 s= fleet.search(make);
//                 System.out.println(s);
//             }else if (x.equals("4")){
//                 System.out.println("\nWhat is the make and model of the car you want to modify?");
//                 String make1 = scan.nextLine();
//                 FleetOfCars mod = fleet.search(make1);
//                 String yesOrNo1;
//                 for (int i=0; i < mod.getSize(); i++){
//                     Scanner s3 = new Scanner(System.in);
//                     System.out.println(mod.get(i));
//                     System.out.println("\nIs this the car you wish to modify? (Enter Y or N)");
//                     yesOrNo1= s3.nextLine().toLowerCase();
//                     if (yesOrNo1.equals("y")){
//                         System.out.println("\nWhat is the make and model of this car?");
//                         String make2= s3.nextLine();
//                         mod.get(i).setMakeAndModel(make2);
//                         System.out.println("\nWhat is the maximum amount of passengers for this car?");
//                         int max= s3.nextInt();
//                         mod.get(i).setMaximumNumberOfPassengers(max);
//                         System.out.println("\nHow many doors does this car have?");
//                         int doors= s3.nextInt();
//                         mod.get(i).setNumberOfDoors(doors);
//                     }
//                 }
//             }else if (x.equals("5")){
//                 Scanner s4 = new Scanner(System.in);
//                 Scanner s5= new Scanner(System.in);
//                 System.out.println("\nWhat is the index of the car you wish to delete?");
//                 int i= s4.nextInt();
//                 if (i < 0 || i >= fleet.getSize()){
//                     System.out.println("\nInvalid input");
//                 }else{
//                     System.out.println(fleet.get(i));
//                     System.out.println("\nIs this the element you wish to delete? (Enter Y or N)");
//                     String yesOrNo= s5.nextLine();
//                     yesOrNo = yesOrNo.toLowerCase();
//                     if (yesOrNo.equals("y")){
//                         fleet.delete(i);
//                     }
//                 }

//              }
//         } 
//     }
// }
