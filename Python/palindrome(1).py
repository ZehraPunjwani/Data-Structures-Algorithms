##
#  This program uses recursion to determine if a string is a palindrome.
#

def main() :
   string1 = "Madam"
   string2 = "Margam"
   #Your extended program should eg work for the following strings.
   #string1= "Madam, I'm Adam!"      
   #string2 = "Sir, I'm Eve!"
   print(string1)
   print("Palindrome:", isPalindrome(string1))
   
   print(string2)
   print("Palindrome:", isPalindrome(string2))

## Tests whether a text is a palindrome.
#  @param text a string that is being checked
#  @return True if text is a palindrome, False otherwise
#
def isPalindrome(text) :
   length = len(text)

   # Case for shortest strings. 
   if length <= 1 :
      return True
   else :
      # Get first and last characters, converted to lowercase. 
      first = text[0].lower()
      last = text[length - 1].lower()

      if first.isalpha() and last.isalpha() :
         # Both are letters. 
         if first == last :
            # Remove both first and last character. 
            shorter = text[1 : length - 1]
            return isPalindrome(shorter)
         else :            
            return False


      
         
# Start the program.
main()
