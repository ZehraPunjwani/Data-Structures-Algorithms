#
# Written By: Zehra Punjwani
# Date: December 2014
# Deatils: Prints a box using strings
#

def main():
    contents = input("Please enter content: ")
    result = boxString(contents)
    print(result)
    print("\n")

def boxString(contents) :
    n = len(contents)
    if n == 0:
        return
    else:
        print("-" * (n + 2))
        print("!" + contents + "!")
        print("-" * (n + 2))

main()
main()
