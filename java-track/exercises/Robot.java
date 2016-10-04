
//import org.junit.Test;


public class Robot {

	/*Name
	Position (this should be two dimensional, use x and y coordinates)

	Speed
	Orientation: which direction is the robot facing? 
	To keep this simple, we we limit ourselves to four directions: north, south, east, and west.
	 */

	String name;
	int xpos;
	int ypos;
	int speed;
	int orientation;
	//call 0-East, 1-North, 2-West, 3-South

	public double Distance(Robot bender)
	{
		double dist;
		dist=Math.sqrt(Math.pow(xpos-bender.xpos,2)+Math.pow(ypos-bender.ypos,2));
		return dist;
	}
	public Robot(String name, int xpos, int ypos, int speed, int orientation)
	{
		this.name=name;
		this.xpos=xpos;
		this.ypos=ypos;
		this.speed=speed;
		this.orientation=orientation;
	}

	//Our Robot can return a String that contains its name, 
	//position, speed, and orientation.
	public String Update()
	{
		String response;
		response="Name: "+ this.name; 
		response+=" xpos: "+ String.valueOf(this.xpos);
		response+=" ypos: "+ String.valueOf(this.ypos);
		response+=" speed: "+ String.valueOf(this.speed);
		response+=" orientation: ";

		switch(this.orientation)
		{
		case 0: response+="East";
		break;
		case 1: response+="North";
		break;
		case 2: response+="West";
		break;
		case 3: response+="South";
		break;
		}

		return response;


	}

	public void moveRobot(){

		switch(this.orientation)
		{
		case 0: this.xpos+=this.speed;
		//east		
		break;
		case 1: this.ypos+=this.speed;
		//north
		break;
		case 2: this.xpos-=this.speed;
		//west
		break;

		case 3: this.ypos-=this.speed;

		break;
		}

	}

	public void rotateRobot(int dir){
		//direction 0 for counter-clockwise and 1 for clockwise
		 this.orientation+= Math.pow(-1, dir);
		 if (this.orientation>=4){
			 this.orientation=-4;
		 }
		 if (this.orientation<0){
			 this.orientation+=4;
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static void main (string[] args) basically says we are going to 
		//use the previous code and do this:
		Robot bender=new Robot("bender", 0,0, 20, 0); 	
		Robot lore=new Robot("lore", 5,5, 25, 2);
		System.out.println(bender.Update());
		System.out.println(lore.Update());
		System.out.println(bender.Distance(lore));
		lore.moveRobot();
		System.out.println(lore.Update());
		bender.rotateRobot(1);
		System.out.print(bender.Update());
		
	}

}

