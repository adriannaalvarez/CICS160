class Car:
    def __init__(self,makeAndModel="none assigned",numberOfDoors=4,maximumNumberOfPassengers=5):
        self.model= makeAndModel
        self.doors= numberOfDoors
        self.passengers= maximumNumberOfPassengers

    def setMakeAndModel(self,make):
        self.model= make

    def getMakeAndModel(self):
        return self.model
    
    def getMaximumNumberOfPassengers(self):
        return self.passengers
    
    def __str__(self):
        return "Make and Model: " + self.model + "\nNumber of Doors: " + str(self.doors) + "\nMaximum Number of Passengers: " + str(self.passengers)
