public class Course {
	/*
 Name
Credits
Number of seats remaining
Roster of Students
	 */

	String Name;
	//int CourseNum;
	double cumGPA=0.0;
	int Credits;
	int RemSeats;
	String[] roster;



	public boolean addStudent(Student Jeffrey){
		/*
	 returns a boolean based on whether or not the student was successfully 
	 added to the course. 
	 Check to make sure that the student has not already 
	 enrolled, and update the number of seats remaining. 
	 When checking that the student has not already enrolled, 
	 use the student's name to compare an 
	 enrolled student to the student that you are trying to add. 
		 */
		String Name = Jeffrey.First_Name + " " + Jeffrey.Last_Name;

		if (RemSeats>0){
			for(int i=this.roster.length;i>this.RemSeats;i--){
				if(Name.equals(this.roster[i-1]))
					return false;
			}
			this.RemSeats--;
			this.roster[this.RemSeats]=Name;
			this.cumGPA+=Jeffrey.GPA;
			return true;
		}

		return false;
	}

	public String generateRoster(){

		//Returns a String that represents a roster with all of the students in the course. 
		//Make sure to omit "empty" seats!
		String roster="";
		for(int i=this.roster.length;i>this.RemSeats;i--){
			roster+=this.roster[i-1];
			roster+="\n";
		}
		//initialize, populate roster


		return roster;

	}

	public double averageGPA(){

		//returns the average GPA of all students enrolled in the course. 
		//Make sure to omit "empty" seats!
		//are we invoking the other Class yes?
		return (this.cumGPA)/(this.roster.length-this.RemSeats); 
	}

	public String toString(){

		//should contain the course number and credits
		String Status;
		Status=this.Name;
		Status+=" Credit Hours: ";
		Status+=String.valueOf(this.Credits);
		return Status;
	}
	public static void main(String[] args) {
/*
		// TODO Auto-generated method stub
		//System.out.print(roster);
		Student Joe= new Student();
		//System.out.println(Joe.getClassStanding());
		Joe.GPA=3.211;
		Joe.Creds=70;
		Joe.First_Name="Joe";
		Joe.Last_Name="Jonestar";
		Joe.Identify=247;
		Course Economics=new Course();
		Economics.Name= "Economics";
		Economics.Credits= 5;
		Economics.RemSeats=30;
		Economics.roster= new String[Economics.RemSeats];
		System.out.println(Economics.addStudent(Joe));
		System.out.println(Economics.addStudent(Joe));
		System.out.println(Economics.generateRoster());
		System.out.println(Economics.averageGPA());
		System.out.println(Economics.toString());
*/
	}

}
