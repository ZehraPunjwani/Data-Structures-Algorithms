#
# Written By: Zehra Punjwani
# Date: December 2014
# Deatils: This program prints the average of salary values that are terminated with a sentinel.
#

# Initialize variables to maintain the running total and count.
total = 0.0
count = 0

# Initialize salary to any non-sentinel value.
salary = 0.0

# Process data until the sentinel is entered.
while salary >= 0.0 :
   salary = float(input("Enter a salary or -1 to finish: "))
   if salary >= 0.0 :
      total = total + salary
      count = count + 1
   
# Compute and print the average salary.
if count > 0 :
   average = total / count
   print("Average salary is", average)
elif count == -1 :
   print("End of program")
elif count < -1 or count == "" :
   print("No data was entered, or incorrect data input.")
