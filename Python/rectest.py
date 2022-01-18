
# Check the following programms, and their problems, and correct them!
# Solve them step by step, ie. start with typing main1()...

def main1():
    #Aim: print "hi" 10 times.
    test1(10)
    #hint use control cc to interrupt, or better correct the program first.


def test1(n):
    print("hi")
    test(n-1)
##############################################


def main2():    
   #print result in main: how often can the number 1000 be devided by 2?
   print(test2(1000,0))

   
def test2(n,counter):
    if n<=1:
        return counter
    else:
        return test2(n % 2, counter + 1)
    
   
###############################################
def main3():
    #Aim: print all odd number from 99 to 0
   test3(99)

def test3(n):
    if not n == 0:
       print(n)
    else:
       test3(n-2)
################################################
def main4() :
     #Aim: print the nth financci number,
     # i .e. the nth number in the sequence 1,1,2,3,5,8,13,21,...
     fib(n)


def fib(n) :
   if n <= 2 :
      return 1
   else :
      return fib(n - 1) + fib(n - 1)      
    

    
