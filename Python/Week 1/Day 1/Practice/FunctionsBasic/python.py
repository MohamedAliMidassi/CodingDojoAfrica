i=0

def Countdown():
    arr=[]
    for i in range (5,-1,-1):
        arr.append(i)
    print(arr)
Countdown()

def PrintAndReturn():
    arr=[1,2]
    for i in range(len(arr)):
        print(arr[i])
    return arr[1]
PrintAndReturn()

def FirstPlusLength():
    arr=[1,2,3,4,5]
    sum=arr[0]+len(arr)
    print(sum)
    return sum
FirstPlusLength()

def ValueGreaterThanSecond():
    arr=[5,2,3,2,1,4]
    arr2=[]
    for i in range(len(arr)):
        if(arr[i]>arr[1]):
            arr2.append(arr[i])
        i+=1
    
    print(len(arr2),(arr2))
ValueGreaterThanSecond()

def LengthTathValue():
    arr=[7,7,7,7]
    arr2=[2,2,2,2,2,2]
    for i in range(len(arr)):
        if(arr[i]==arr[1]):
            print((len(arr),arr[1]))
        break
    for i in range(len(arr2)):
        if(arr2[i]==arr2[1]):
            print((len(arr2),arr2[1]))
        break
    
LengthTathValue()        