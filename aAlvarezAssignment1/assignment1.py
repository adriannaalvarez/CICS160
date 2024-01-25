import math

def is_prime(num):
    x=2
    sq= int(math.sqrt(num))
    while (x <= sq):
        if (num%x) == 0:
            return False
        x+=1
    else:
        return True
    
def are_relatively_prime (num1,num2):
    if num1==num2:
        return False
    if num1%2==0 and num2%2==0:
        return False
    if num1%3==0 and num2%3==0:
        return False
    if num1%5==0 and num2%5==0:
        return False
    if num1 > num2:
        if num1%num2==0:
            return False
        else:
            return True
    if num1 < num2:
        if num2%num1==0:
            return False
        else:
            return True

def primes(num):
    pList= []
    i=0
    while i <= num:
        if num==1:
            return pList
        if is_prime(i)==True:
            pList.append(i)
        i= i+1
    return pList

def prime_decomposition(num):
    pList=[]
    sq= int(math.sqrt(num))
    if num==1:
        return pList
    if is_prime(num)== True:
        pList.append(num)
        return pList
    if sq*sq==num:
        if is_prime(sq)== True:
            pList.append(num)
            pList.append(sq)
            pList.append(1)
            return pList

    while num != 2 or num != 3 or num != 5:
        if num%2==0:
            pList.append(2)
            num= int(num/2)
        if num%3==0:
            pList.append(3)
            num= int(num/3)
        if num%5==0:
            pList.append(5)
            num= int(num/5)
        if num==1:
            return pList



if __name__=="__main__":
    isPrime = int(input("Please enter a positive integer that is greater than one: "))
    print (is_prime(isPrime))
    relativelyPrime1= int(input("Please enter the first integer: "))
    relativelyPrime2= int(input("Please enter the second integer: "))
    print(are_relatively_prime(relativelyPrime1,relativelyPrime2))
    prime= int(input("Please enter a positive integer: "))
    print(primes(prime))
    primeDecomposition= int(input("Please enter a positive integer: "))
    print(prime_decomposition(primeDecomposition))