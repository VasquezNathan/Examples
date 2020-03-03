from logic import TruthTable
tables = input("Enter a proposition: ")
cont = False
#get all of the inputs
while input("\nWould you like to enter more (Y/N): ") in ['y','Y']:
    tables = tables + " and " + input("\nEnter a proposition: ")

table = TruthTable([tables])

print("\nYour propositions contain the following variables: ", table.vars)

meanings = []

for i in range(len(table.vars)):
    print("\nEnter the meaning of", table.vars[i], ":", end = " ")
    meanings.append(input())
    
count = 0
for i in range(len(table.table)):
    
    if table.table[i][len(table.table[0])-1][0] == 1:
        cont = True
        break
    count = count + 1

#table.display()
#print("consistant on index : ", count)
#print(table.table[count][0])

if  cont == True:
    print("\nYour description is consistent when: \n")
    for i in range(len(table.vars)):
        if table.table[count][0][i] == 1:
            print("it is the case that", meanings[i])
        else:
            print("it is not the case that", meanings[i])
    
else:
    print("Your description cannot be consistent")

