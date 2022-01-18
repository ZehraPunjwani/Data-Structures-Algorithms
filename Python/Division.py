import math

def main():
    try: 
       a = int(input("enter number1:"))
       b = int(input("enter number2:"))
       result = a/b
       prod = math.factorial(a)
       print(result,prod)

    except ValueError:
        print("A valueError occurred")

    except ZeroDivisionError:
        print("Division by 0 not possible")
 
main()
main()
