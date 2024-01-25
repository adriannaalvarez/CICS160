from Car import Car
from Node import Node
class LinkedList:
    def __init__(self):
        self.head= None
        self.tail= None
        self.size= 0

    def __str__(self):
        stringToReturn = "List size: " + str(self.size)
        current = self.head
        while (current is not None):
            stringToReturn = stringToReturn + "\n\n" + str(current)
            current = current.getNext()
        return(stringToReturn)

    def add(self,o):
        new= Node(o)
        if self.size==0:
            self.head= new
            self.tail= new
            self.size+=1
        else:
            currentTail= self.tail
            currentTail.setNext(new)
            new.setPrevious(currentTail)
            self.tail= new
            self.size+=1
    
    def __setitem__(self, i, o):
        new= Node(o)
        if i > self.size:
            return
        if i == 0:
            currentHead= self.head
            currentHead.setPrevious(new)
            new.setNext(currentHead)
            self.head= new
            self.size+=1
            return
        if i == self.size:
            self.add(o)
            return
        current= self.head
        for x in range(i):
            current= current.getNext()
        cPrevious= current.getPrevious()
        new.setPrevious(cPrevious)
        new.setNext(current)
        current.setPrevious(new)
        cPrevious.setNext(new)
        self.size+=1
    
    def length(self):
        return self.size
    
    def __getitem__(self,i):
        if i >= self.size:
            return 
        current= self.head
        for x in range(i):
            current= current.getNext()
        return current.getData()
        
    def delete(self,i):
        if self.size==0:
            return
        if i >= self.size:
            return
        if i==0:
            afterHead= self.head.getNext()
            afterHead.setPrevious(None)
            self.head = afterHead
            self.size-=1
            return
        if i== self.size-1:
            beforeTail= self.tail.getPrevious()
            beforeTail.setNext(None)
            self.tail= beforeTail
            self.size-=1
            return
        current= self.head
        for x in range(i):
            current= current.getNext()
        cPrevious= current.getPrevious()
        cNext= current.getNext()
        cPrevious.setNext(cNext)
        cNext.setPrevious(cPrevious)
        self.size-=1

if __name__ == "__main__":
    one= Car("one")
    two= Car("two")
    three= Car("three")
    four= Car("four")
    li= LinkedList()
    li.add(one)
    li.add(two)
    li.add(three)
    li.insert(3,four)
    print (li)