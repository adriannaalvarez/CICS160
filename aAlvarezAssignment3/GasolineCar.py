from Car import Car
class GasolineCar(Car):
    def __init__(self,makeAndModel="none assigned",numberOfDoors=4,maximumNumberOfPassengers=5,gasTankSize=-1):
        super().__init__(makeAndModel,numberOfDoors,maximumNumberOfPassengers)
        self.tank= gasTankSize

    def getGasTankSize(self):
        return self.tank
    
    def setGasTankSize(self,size):
        self.tank =size

    def __str__(self):
        return super().__str__() + "\nGas Tank Size: " + str(self.tank)