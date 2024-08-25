i=0
def Basic() :
    for i in range(150):
        print(i)
Basic()
def Multiplesofive():
    for i in range(1000):
        if(i%5==0):
            print(i)
Multiplesofive()
def counting_thedojoway():
    for i in range(100):
        if(i%10==0):
            print("Coding Dojo")
        elif(i%5==0):
            print("Coding")
counting_thedojoway()
def that_sucker_huge():
    sum=0
    for i in range (500000):
        sum+=1
    print(sum)
that_sucker_huge()
def countdown():
    for i in range(2018,0,-4):
        print(i)
countdown()
def flexiblecounter(lowNum,highNum,mult):
    for lownum in range(highNum):
        if(lowNum/mult!=0):
            print(lowNum/mult)
        if(highNum/mult!=0):
            print(lowNum/mult)
flexiblecounter(6,9,3)