class Node:
    def __init__(self,d=None):
        self.data= d
        self.next= None
        self.previous= None
    
    def setData(self,d):
        self.data= d
    
    def getData(self):
        return self.data
    
    def setNext(self,n):
        self.next= n

    def getNext(self):
        return self.next
    
    def setPrevious(self,p):
        self.previous= p

    def getPrevious(self):
        return self.previous
    
    def __str__(self):
        return (str(self.getData()))