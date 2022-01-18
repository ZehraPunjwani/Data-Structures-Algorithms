#
# Written By: Zehra Punjwani
# Date: December 2014
# Deatils: This program counts the number of vowels in a string
#

def main():
    print("Welcome:", "\n", "1: Enter text manually", "\n", "2: Read a file")
    userInput = int(input("What would u like: "))
    if userInput == 1:
        sentance = input("Please enter a sentance: ")
        result = userInputCountVowels(sentance)
        print("There are", result, "vowel(s) in your sentance")
    elif userInput == 2:
        #fileName = input("Please enter the name of the file with its extension: ")
        fileName = "text.txt"
        result = fileCountVowels(fileName)
        print("There are", result, "vowel(s) in your File")
    else:
        print("ERROR, value out of range")
        main()

def userInputCountVowels(sentance):
    count = 0
    total = 0
    while count < len(sentance):
        letter = sentance[count].upper()
        vowels = "AEIOU"
        if letter in vowels:
            total += 1
        count = count + 1
    return total

def fileCountVowels(fileName):
    print("\n", "-----------------------Start Of File Content-------------------")
    vowels = "AEIOU"
    with open(fileName, "r") as f:
        for line in f:
            print(line.strip("\n"))
    print("-----------------------End Of File Content-------------------", "\n")
    with open(fileName, "r") as f:
        text = f.read().upper()
        
    total = {ltr: 0 for ltr in vowels}

    for letter in text:
        if letter in vowels:
            total[letter] += 1

    return sum(total.values())

main()
