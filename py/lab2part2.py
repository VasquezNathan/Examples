from logic import TruthTable
prop1, prop2 = input("Enter proposition 1: "), input("Enter proposition 2: ")
table1 = TruthTable([prop1])
table2 = TruthTable([prop2])

if table1.table == table2.table:
    print("The propositions are equivalent")
else:
    print("The propositions are not equivalent")
