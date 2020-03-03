from logic import TruthTable
tables = input("Enter a proposition: ")

while input("Would you like to enter more (Y/N): ") in ['y','Y']:
    tables = tables + " and " + input("Enter a proposition: ")

table = TruthTable([tables])
#table.display()
#print(len(table.table))
cont = False
for i in range(len(table.table)):
#    print(table.table[i][len(table.table[0])-1])
    if table.table[i][len(table.table[0])-1] == [1]:
        cont = True
        break
if  cont == True:
    print("Your description is consistent")
else:
    print("Your description is not consistent")
