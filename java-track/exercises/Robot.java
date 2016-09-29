
public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 /*Name
Position (this should be two dimensional, use x and y coordinates)
Is this like turtles? 
Speed
Orientation: which direction is the robot facing? 
To keep this simple, we we limit ourselves to four directions: north, south, east, and west.
*/

 Turtle myTurtle;

 int size, turn;

 myTurtle = new Turtle( );

 size = 100; //logical units
 turn = 90; //in degree
SampleTurtle2.java

 //set some properties
 myTurtle.bodyColor( Color.black ); //body color is black

 myTurtle.jumpTo( 50, 0 ); //set the starting position to (50,0)
 //jumping to it
 //draw a square
 myTurtle.penSize( 5 ); //draw the bottom side
 myTurtle.penColor( Color.green ); //in green 5 units wide
 myTurtle.move( size );
 myTurtle.turn( turn );

 myTurtle.penUp( ); //just move along the right side
 myTurtle.move( size ); //without drawing by placing the
 myTurtle.turn( turn ); //pen in the up position

 myTurtle.penDown( ); //draw again by putting the
 myTurtle.penSize( 3 ); //pen down; set pen size to 3
 myTurtle.penColor( Color.blue ); //and color to blue
 myTurtle.move( size );
 myTurtle.turn( turn );

 myTurtle.speed( 5 );
 myTurtle.penSize( 7 ); //draw the final side in one-fourth
 myTurtle.penColor( Color.red ); //the default speed (which is 20) with
 myTurtle.move( size ); //pen size 7 and color red
 myTurtle.turn( turn ); 