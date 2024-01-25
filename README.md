# CICS160
CICS160 Object Oriented Programming Projects

## aAlvarezAssignment1
### Learning Goals:
This assignment is designed to give you an opportunity to check your proficiency with commonly-used Python programming, before we start working with classes and objects. This includes input and output operations, conditionals, loops, functions, and lists. Each of the tasks below require you to write functions.

## assignment1
- **is_prime(x:int)-> boolean:** returns true if x is prime and false if it is not; int x must be a positive integer greater than 1

- **are_relatively_prime(x:int, y:int)-> boolean:** returns true if x and y share at least one common factor that is not one and false otherwise; x and y must be positive integers

- **primes(x:int)-> [int]:** returns a list of prime integers that are equal to or smaller than x; int x must be a positive integer

- **prime_decomposition(x:int)-> [int]:** returns a list of integers that make up the prime decomposition; int x must be a positive integer

## aAlvarezAssignment3
### Learning Goals:
This assignment is designed to for you to demonstrate the ability to implement linked lists, use lists of any type, and engage with inheritance. 

## Car
- **__ init __(makeAndModel="none assigned", numberOfDoors=4, maximumNumberOfPassengers=5)-> void:** initalizes Car object
  
- **setMakeAndModel(make:String)-> void:** sets the value of makeAndModel to make

- **getMakeAndModel()-> String:** returns the value of the car's attribute makeAndModel

- **getMaximumNumberOfPassengers()-> int**: returns the value of the car's attribute maximumNumberOfPassengers

- **__ str __()-> String:** returns a String representation of the car

## ElectricCar
- **__ init __(makeAndModel="none assigned", numberOfDoors=4, maximumNumberOfPassengers=5, batterySize = -1)-> void:** intializes ElectricCar object

- - **getbatterySize()-> int:** returns the value of the electric car's attribute batterySize

- **setbatterySize(size:int)-> void:** sets the batterySize to the input size

- **__ str __()-> String:** returns a String representation of the electric car

## GasolineCar
- **__ init __(makeAndModel="none assigned", numberOfDoors=4, maximumNumberOfPassengers=5, gasTankSize = -1)-> void:** intiatlizes GasolineCar object

- **getGasTankSize()-> int:** returns the value of the gasoline car's attribute gasTankSize

- **setGasTankSize(size:int)-> void:** sets the gasTankSize to the input size

- **__ str __()-> String:** returns a String representation of the gasoline car

## LinkedList
- **__ init __()-> void:** initalizes an empty LinkedList

- **add(x:object)-> void:** appends x to the end of the list

- **insert(i:int, x:object)-> void:** appends x at index i of the list

- **length()-> int:** returns the length of the list

- **__ getitem __(i:int)-> Object:** returns the object stored at index i

- **delete(int)-> void:** deletes the object that is stored at index i

- **__ str __()-> String:** returns a String representation of the list

## Node
- **__ init __(data:Object)-> void:** initalizes Node object

- **setData(d:Object)-> void:** sets the data attribute to d

- **getData()-> Object:** returns the data attribute

- **setNext(x:Object)-> void:** sets the next attribute to x

- **getNext()-> Object:** returns the value of the next attribute

- **setPrevious(x:Object)-> void:** sets the previous attribute to x

- **getPrevious()-> Object:** returns the value of the previous attribute

- **__ str __()-> String:** returns a String representation of the node

## aAlvarezAssignment4
### Learning Goals:
This assignment is designed to for you to demonstrate the ability to use lists in Java. It will also give you greatpractice on dividing a project into classes, delegating operations to specific classes based on information hiding and data encapsulation, and testing.

## Car
- **Car(makeAndModel:String, numberOfDoors:int, maximumNumberOfPassengers:int)-> void:** initalizes Car object

- **Car()-> void:** initalizes Car object
  
- **setMakeAndModel(make:String)-> void:** sets the value of makeAndModel to make

- **getMakeAndModel()-> String:** returns the value of the car's attribute makeAndModel

- **getMaximumNumberOfPassengers()-> int**: returns the value of the car's attribute maximumNumberOfPassengers

- **toString()-> String:** returns a String representation of the car

## ElectricCar
- **ElectricCar(makeAndModel:String, numberOfDoors:int, maximumNumberOfPassengers:int, batterySize:double)-> void:** intializes ElectricCar object

- **ElectricCar()-> void:** initalizes ElectricCar object

- - **getbatterySize()-> int:** returns the value of the electric car's attribute batterySize

- **setbatterySize(size:int)-> void:** sets the batterySize to the input size

- **toString()-> String:** returns a String representation of the electric car

## GasolineCar
- **GasolineCar(makeAndModel:String, numberOfDoors:int, maximumNumberOfPassengers:int, gasTankSize:double)-> void:** intiatlizes GasolineCar object

- **GasolineCar()-> void:** initalizes GasolineCar object

- **getGasTankSize()-> int:** returns the value of the gasoline car's attribute gasTankSize

- **setGasTankSize(size:int)-> void:** sets the gasTankSize to the input size

- **toString()-> String:** returns a String representation of the gasoline car

## FleetOfCars
- **FleetOfCars()-> void:** initalizes FleetOfCars object

- **add(c:Car)-> void:** adds c to the fleet

- **getSize()-> int:** returns the size of the fleet

- **delete(i:int)-> void:** deletes the object at index i

- **get(i:int)-> Car:** returns the Car at index i of the fleet

- **search(s:String)-> FleetOfCars:** returns a FleetOfCars that contain all the Cars that have the same makeAndModel attribute as s

- **toString()-> String:** returns a String representation of the fleet

## aAlvarezAssignment5
### Learning Goals:
This assignment is designed to for you to demonstrate engagement with a broad set of topics related to our course. Among these: knowledge of both implementing and using queues, your ability to abstract a class definition by having objects such as lists and queues inside other objects, testing via Java Junit tests, and to find and use online documentation about the built-in Java ArrayList and LinkedList classes. In addition, this assignment will be good practice on the process of dividing bigger tasks into smaller components, and then implementing those smaller components, which is an important skill in computer programming.

## Car
- **Car(id:int, powerSource:int, pricePerDay:float)-> void:** initalizes Car object

- **Car()-> void:** intializes Car object

- **getId()-> int:** returns the id attribute of the car

- **setId(x:int)-> void:** sets the id attribute to x

- **getPowerSource()-> int:** returns the attribute powerSource of the car

- **setPowerSource(x:int)-> void:** sets powerSource attribute to x

- **toString()-> String:** returns a String representation of the car

## Queue
- **Queue()-> void:** intializes Queue object

- **enqueue(x:Object)-> void:** adds x to the end of the queue

- **dequeue()-> Object:** returns the first object of the queue and removes it

- **peek()-> Object:** returns the first object of the queue

- **isEmpty()-> boolean:** returns true if it is empty and false if it is not

## CarLot
- **CarLot()-> void:** intalizes CarLot object

- **addCar(x:Car)-> boolean:** returns true if the x is added and false if it is not. Car x must have 1, 2, or 3 as its powerSource attribute in order to be added

- **processRequests(x:CarRequests)-> LinkedList<Car>:** returns a LinkedList that contain Cars from the CarLot that have the powerSource as the requests from x. When it is added to the LinkedList, it is removed from the CarLot. If there is no Car left in the CarLot to fufill the request, it adds a Car with an id attribute of 0

## CarRequests
- **CarRequests()-> void:** initalizes CarRequests object

- **addRequest(x:Integer)-> void:** adds x to the CarRequest

- **getRequest()-> Integer:** returns the first request of CarRequests

- **hasPendingRequests()-> boolean:** returns true if there are any requests in the CarRequests object and false if there is not


