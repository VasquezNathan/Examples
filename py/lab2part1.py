from logic import TruthTable

tables = [TruthTable(['-a']),
TruthTable(['a and b']),
TruthTable(['a or b']),
TruthTable(['a -> b']),
TruthTable(['a <-> b'])]

for i in tables:
    i.display()
    print('\n')

