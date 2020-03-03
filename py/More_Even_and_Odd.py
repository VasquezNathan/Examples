#for i in range(10):
#    x = input("Enter a number: ")
#
#    if(input("Enter a number: ")) % 2 == 0:
#        print("EVEN")
#    else:
#        print("ODD")
#
#intArray = []
#
#for i in range(10):
#    n = int(input("Enter inarray[" + str(i)+ "]: "))
#    intArray.append(n)
#
#temp = 0
#for i in range(len(intArray)):
#    if (intArray[i] % 2 != 0 and intArray[i] > temp):
#        temp = intArray[i]
#
#if (temp % 2) != 0:
#    print(temp)
#else:
#    print("no odd numbers")
temp = None
for i in range(10):
    n = int(input("Enter a number: "))
    if((n % 2 != 0 and temp is None) or (n % 2 != 0 and n > temp)):
        temp = n
if temp != None and temp % 2 == 1:
    print(temp)
else:
    print("no odds")
    
