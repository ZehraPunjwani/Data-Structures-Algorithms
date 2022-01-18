#
# Written By: Zehra Punjwani
# Date: December 2014
# Deatils: This program simulates a drink bring ordered.
#

#ask customer for their order
drink = input("Your Order: ").lower()

if drink == "wine":
    #age customer for age
    age = int(input("Please enter your age: "))
    if age >=21:
        i = "Serve"
    else:
        i = "Politely explain law to the customer"
else:
    i = "Serve customer Non-Alcoholic drink"

print(i)
