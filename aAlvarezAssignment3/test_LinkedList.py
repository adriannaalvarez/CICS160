import unittest
from LinkedList import LinkedList
from Car import Car
class Test_LinkedList(unittest.TestCase):
    def test_insertAtHead(self):
        l= LinkedList()
        l.add(Car("one"))
        l.add(Car("two"))
        l.add(Car("three"))
        test = Car("test")
        l.insert(0,test)
        self.assertEqual(l.__getitem__(0),test)
    def test_insertAtTail(self):
        l= LinkedList()
        l.add(Car("one"))
        l.add(Car("two"))
        l.add(Car("three"))
        test = Car("test")
        l.insert(3,test)
        self.assertEqual(l.__getitem__(3),test)
    def test_insertAtMiddle(self):
        l= LinkedList()
        l.add(Car("one"))
        l.add(Car("two"))
        l.add(Car("three"))
        test = Car("test")
        l.insert(1,test)
        self.assertEqual(l.__getitem__(1),test)
    def test_deleteAtHead(self):
        l= LinkedList()
        newFront = Car("head")
        l.add(Car("one"))
        l.add(newFront)
        l.add(Car("three"))
        l.delete(0)
        self.assertEqual(l.__getitem__(0),newFront)
    def test_deleteAtTail(self):
        l= LinkedList()
        newEnd = Car("head")
        l.add(Car("one"))
        l.add(newEnd)
        l.add(Car("three"))
        l.delete(2)
        self.assertEqual(l.__getitem__(l.size-1),newEnd)
    def test_deleteAtMiddle(self):
        l= LinkedList()
        test = Car("test")
        l.add(Car("one"))
        l.add(Car("two"))
        l.add(test)
        l.delete(0)
        self.assertEqual(l.__getitem__(1),test)

if __name__ == "__main__":
    unittest.main()