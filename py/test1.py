def countShit():
    name = input("Enter the name that you want ")
    letter = input("Now enter the letter that you want ")
    number = 0
    for i in name:
        if i == letter:
            number = number + 1

    print(number)
countShit()
