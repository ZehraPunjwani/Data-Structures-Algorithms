#
# Written By: Zehra Punjwani
# Date: December 2014
# Deatils: This program is a measure converter
#

def cm(centimeter):
    """Centimeter to Meters Converter!"""
    if centimeter == ("false"):
        print ("It looks like you input a value that wasn't a number! Try again!")
    else:
        result = round(centimeter / 100)
        print ("%d centimeters is the same as %d meters." % (centimeter, result))
def meter(meter):
    """Meter to Centimeters Converter!"""
    if meter == ("false"):
        print ("It looks like you input a value that wasn't a number! Try again!")
    else:
        result = round(meter * 100)
        print ("%d meters is the same as %d centimeters." % (meter, result))
def cent2(centin):
    """Centimeter to Inches Converter!"""
    if meter == ("false"):
        print ("It looks like you input a value that wasn't a number! Try again!")
    else:
        result = centin * 0.39
        print ("%d centimeters is the same as %d inches." % (centin, result))
def inchcm(inches):
    """Feet to Meters Converter!"""
    if inches == ("false"):
        print ("It looks like you input a value that wasn't a number! Try again!")
    else:
        result = inches / 0.39
        print ("%d inches is the same as %d centimeters." % (inches, result))
def kmmiles(km):
    """Meters to Inches Converter!"""
    if km == ("false"):
        print ("It looks like you input a value that wasn't a number! Try again!")
    else:
        result = km * 0.62137
        print ("%d km is the same as %d miles." % (km, result))
def mileskm(miles):
    """Miles to KM Converter!"""
    if miles == ("false"):
        print ("It looks like you input a value that wasn't a number! Try again!")
    else:
        result = miles / 0.62137
        print ("%d miles is the same as %d kilometers." % (miles, result))
def fer(fc):
    """Farenheight to Celcius Converter!"""
    if fc == ("false"):
        print ("It looks like you input a value that wasn't a number! Try again!")
    else:
        result = (fc - 32) * 5/9
        print ("%d farenheit is the same as %d celcius." % (fc, result))
def cel(cf):
    """Farenheight to Celcius Converter!"""
    if cf == ("false"):
        print ("It looks like you input a value that wasn't a number! Try again!")
    else:
        result = cf * 9/5 + 32
        print ("%d celcius is the same as %d farenheit." % (cf, result))
print ("Kevin's Sexy Converter!")
print("")
print("A. Length")
print("B. Temperature")
print("C. Mass")
print("")
type=input("Please choose an option: ")
if type == ("a") or type ==("A"):
    print("")
    print("1. CM to Meters")
    print("2. Meters to CM")
    print("3. CM to Inches")
    print("4. Inches to CM")
    print("5. KM to Miles")
    print("6. Miles to KM")
    print("")
    test=input("Please choose an option: ")
    if test == ("1"):
        cent=input("Centimeters: ")
        if cent.isdigit():
            cm(int(cent))
        else:
            cm("false")
    elif test == ("2"):
        meters=input("Meters: ")
        if meters.isdigit():
            meter(int(meters))
        else:
            meter("false")
    elif test == ("3"):
        centin=input("Centimeters: ")
        if centin.isdigit():
            cent2(int(centin))
        else:
            centin("false")
    elif test == ("4"):
        inches=input("Inches: ")
        if inches.isdigit():
            inchcm(int(inches))
        else:
            feeet("false")
    elif test == ("5"):
        km=input("KM: ")
        if km.isdigit():
            kmmiles(int(km))
        else:
            metersin("false")
    elif test == ("6"):
        miles=input("Miles: ")
        if miles.isdigit():
            mileskm(int(miles))
        else:
            metersin("false")
    else:
        print("You did not choose a valid option!")
elif type == ("b") or type == ("B"):
    print("")
    print("1. Farenheit to Celcius")
    print("2. Celcius to Farenheit")
    print("")
    temp=input("Please choose an option: ")
    if temp == ("1"):
        fc=input("Fahrenheit: ")
        if fc.isdigit():
            fer(int(fc))
        else:
            fc("false")
    if temp == ("2"):
        cf=input("Celsius: ")
        if cf.isdigit():
            cel(int(cf))
        else:
            cf("false")
else:
    print("You did not choose a valid option!")
