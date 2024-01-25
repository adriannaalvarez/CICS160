from Car import Car
class ElectricCar(Car):
    def __init__(self,makeAndModel="none assigned", numberOfDoors=4, maximumNumberOfPassengers=5, batterySize=-1):
        super().__init__(makeAndModel,numberOfDoors,maximumNumberOfPassengers)
        self.battery= batterySize
    
    def getBatterySize(self):
        return self.battery
    
    def setBatterySize(self,size):
        self.battery= size
    
    def __str__(self):
        return super().__str__() + "\nBattery Size: " + str(self.battery)
    
