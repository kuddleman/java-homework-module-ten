Carefully review the provided files.

LineInfoGUI: the main JavaFX program

The program allows the user to click two points and create a line.
There are three buttons to allow the user to request information 
about the line:
the distance between the starting and ending points of the line
the midpoint of the line
whether or not the line is horizontal or vertical.

When you run this program as provided, you should be able to 
create lines. 
The buttons have no functionality- this is what you will add.
LineInfoDisplayer: a functional interface with an enum 
and static factory method.

The functional interface has one method: getInfo.
Classes that implement this interface implement the getInfo method.
The getInfo method takes in a line and returns a String of 
information about that line.
In a pre-Java 8 setup, you could imagine writing three classes 
to implement this interface: 
DistanceDisplayer, MidpointDisplayer, VertHorzDisplayer.

The interface declares an enum to describe the three types 
of line information we're using in this program.

The interface contains a static factory method to create an 
object of type LineInfoDisplayer based on the type passed in 
as a parameter.

Requirements:

Review the files provided. 
Make sure you have a good understanding of the methods 
and variables in the provided code.
Post any questions to the discussion board.

(45 points) Complete the LineInfoDisplayer interface.
Implement the factory method to return three different 
possible LineInfoDisplayer objects based on the requested type passed in as a parameter.
Requirement: use lambdas.
Optional suggestion: use a switch statement.

(35 points) Complete the LineInfoGUI class.
Write code to set the action of the three buttons.
For the action, assign a value to the lineInfoDisplayer variable 
using the static factory method you wrote in LineInfoDisplayer.
Update the appropriate Text variable to display the information.
Requirement: use lambdas.

(10 points) Add a time stamp to the LineInfoGUI class.
When the user completes a line, display the time in a human-friendly, readable format. 
Update the variable timeText to display the information.
I do not list where this update should occur- that is part 
of what you should figure out.

(10 points) Style: Your class should follow Java coding conventions and best practices. 
Follow naming conventions for variables, classes, and methods. 

Note that you must use lambdas for this homework. Code written without 
lambdas will receive zero points.xxxxx

