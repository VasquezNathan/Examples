#problem 1
x = 0
for i in range(1000):
    if i % 3 == 0 or i % 5 == 0:
        x = x + i
        
print(x)

#problem 2
b = 1
a = 2
c = 0
total = 0
for i in range(4000000):
    c = a + b
    b = a
    a = c
    if c % 2 == 0: 
        total = total + c
print(total)
    
    
    
