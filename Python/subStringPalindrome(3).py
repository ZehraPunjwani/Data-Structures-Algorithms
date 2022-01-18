##
#  This program uses recursion to determine if a string is a palindrome.
#

def main() :
   #string1 = "Madam"
   #string2 = "Madame"
   #string3 = "Amorecomplicatedtesttsetisthis"
         
   string = str(input("Please enter a text for the palindrome test: "))
   print("Palindrome:", isPalindrome(string))
   

# Tests whether a text is a palindrome.
#  @param text a string that is being checked
#  @return True if text is a palindrome, False otherwise


def isPalindrome(text) :
   return substringIsPalindrome(text, 0, len(text) - 1)

# Recursively tests whether a substring is a palindrome.

def substringIsPalindrome(text, start, end) :
   # Case for substrings of length 0 and 1.
   if start >=(end-1):
      return True
   else :
      # Get first and last characters, converted to lowercase.
      first = text[start].lower()
      last = text[end].lower()
      if first.isalpha() and last.isalpha() :
         if first == last :
            # Test substring that doesn’t contain the matching letters.
            return substringIsPalindrome(text, start + 1, end - 1)
         else :
            
      #to be completed here
         
main()
