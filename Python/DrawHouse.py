#
# Written By: Zehra Punjwani
# Date: December 2014
# Deatils: This program is about drawing a house
#

import tkinter # This is the graphic library

CANVAS_WIDTH = 375
CANVAS_HEIGHT = 625
WINDOW_SIZE = 100
WINDOW_BAR_WIDTH = 5

def main() :
    # Create a window and a canvas - DO NOT EDIT
    window = tkinter.Tk()
    canvas = tkinter.Canvas(window, width=CANVAS_WIDTH, height=CANVAS_HEIGHT)
    
    # Draw house outline
    addPlainHouse(canvas, 25, 200, 300, 350, 100)
    
    # Draw bottom left window
    addWindow(canvas, 50, 400, WINDOW_SIZE, WINDOW_SIZE, WINDOW_BAR_WIDTH)
    
    # Show the window and canvas - DO NOT EDIT
    canvas.pack()
    window.mainloop()

##
# Adds a plain house. 
# @param canvas The graphic canvas to draw to.
# @param x The x coordinate of the house (rectangular part), i.e., the x value of the top left corner disregarding roof.
# @param y The y coordinate of the house (rectangular part), i.e., the y value of the top left corner disregarding roof. 
# @param width The width of the house.
# @param height The height of the house (without roof).
# @param roofHeight The height of the root.
# 
def addPlainHouse(canvas, x, y, width, height, roofHeight) :
    # Draw round roof        
    canvas.create_oval(x, y - roofHeight, x + width, y + roofHeight, fill="pink")
    #Draw main building outline
    canvas.create_rectangle(x, y, x + width, y + height, fill="pink")
    
##
# Adds a window with dividers separating the glass into four sections.
# @param canvas The graphic canvas to draw to.
# @param x The x coordinate of the window, i.e., the x value of the top left corner.
# @param y The y coordinate of the window, i.e., the y value of the top left corner. 
# @param width The width of the window.
# @param height The height of the window.
# @param dividerWidth The width of the dividers of the window.
#
def addWindow(canvas, x, y, width, height, dividerWidth) :
    # Draw background
    canvas.create_rectangle(x, y, x + width, y + height, fill="blue")
    # Draw dividers
    canvas.create_rectangle(x, y + (height / 2) - (dividerWidth / 2), x + width, y + (height / 2) - (dividerWidth / 2) + dividerWidth, fill="white")
    canvas.create_rectangle(x + (width / 2) - (dividerWidth / 2), y, x + (width / 2) - (dividerWidth / 2) + dividerWidth, y + height, fill="white")     

##
# Adds a door with post box.
# @param canvas The graphic canvas to draw to.
# @param x The x coordinate of the door, i.e., the x value of the top left corner.
# @param y The y coordinate of the door, i.e., the y value of the top left corner. 
# @param width The width of the door.
# @param height The height of the door.
##
def addDoor(canvas, x, y, width, height) :
    # Draw background
    canvas.create_rectangle(x, y, x + width, y + height, fill="red")
     
    # Draw Post box
    postBoxY = y + int(0.50 * height) # 50% up from bottom of door
    postBoxHeight = int(0.10 * height) # 10% of the height of door        
    postBoxWidth = int(0.70 * width) # 70% of the width of door
    postBoxX = int(x + (width / 2) - (postBoxWidth / 2))
    canvas.create_rectangle(postBoxX, postBoxY, postBoxX + postBoxWidth, postBoxY + postBoxHeight,fill="black")
     
main()
