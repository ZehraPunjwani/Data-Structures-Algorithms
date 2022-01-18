#  First program for reading from a file:
#  This program reads one line from file, and prints the content to the screen.

# Provide a filename
inputFileName = input("Input file name: ")

# Open the input.
infile = open(inputFileName, "r")

# Read the input and print it to the screen.
line = infile.readline()
while line != "":
    line = infile.readline()
print(line)

# Close the file.
infile.close()
