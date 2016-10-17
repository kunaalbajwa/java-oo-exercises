public class Student {
	/*
 Name (first and last)
Student ID
Credits
GPA

	 */

	//make name one variable
	String First_Name;
	String Last_Name;
	int Identify;
	int Creds;
	double GPA;

public Student(String First_Name, String Last_Name, int Creds){
	
}

	public String getClassStanding(int Credits){
		String Name="";

		if (Credits < 30){
			Name="Freshman"; 
		} 
		else if(Credits <60){ 
			Name="Sophomore";
		}

		else if(Credits <90){ 
			Name="Junior";
		}
		else {
			Name="Senior";
		}
		return Name;
	}

	public void submitGrade(int grade, int ch){
		//what are inputs and outputs; is how you should look at every class
		//grab current credts, GPA
		double GPA = this.GPA;
		int Creds=this.Creds;

		//factor in recalc GPA
		double quality= GPA * Creds;
		quality += grade * ch;
		GPA= (quality/(Creds+ch));
		this.GPA=Math.round(GPA*1000.0)/1000.0;
		this.Creds+=ch;
		//store it as the new GPA

	}

	public double computeTuition(){
		/*
  this method returns the total amount of tuition the student has paid. 
  The average cost of tuition for 1 semester in the United States is roughly 
  $20,000. Assume that there are 15 credit hours per semester, and that any 
  "leftover" credits are computed at the proportional rate.
		 */

		/* pseudocode
 ok so $20k for every 15 ---> 4/3 is the proportion
 now how do i do that; they type in # of credits, we mult by 20k and then divide by 15

  return amount of tuition paid
		 */
		//enter # of creds
		double Tuition=(this.Creds * 20000.0)/15;
		Tuition=Math.round(Tuition*100.0)/100.0;

		return Tuition;
	}

	public void createLegacy(Student Parent1, Student Parent2){
		/*
  it is not unusual for two students to meet at college, get married, 
  start a family, and send their children to the same school. 
  This method should take two Student objects as parameters (one for each parent) 
  then create a new Student object based on the following criteria:

Use one parent's full name as the baby's first name, the other parent's 
full name as the baby's last name
Assign the baby a student ID that is the sum of its parents IDs.
The legacy's estimated GPA will be the average of its parents GPA.
The legacy's estimated number of credits will be the maximum of its parents credits
Hint: it may be useful to create an additional constructor! 

		 */
			
		this.First_Name=Parent1.First_Name + Parent1.Last_Name;
		this.Last_Name=Parent2.First_Name + Parent2.Last_Name;
		this.Identify=Parent1.Identify+Parent2.Identify;
		this.GPA=(Parent1.GPA + Parent2.GPA)/2;
		this.GPA=Math.round(this.GPA*1000.0)/1000.0;
		if(Parent1.Creds>=Parent2.Creds){
			this.Creds=Parent1.Creds;
		}
		else{
			this.Creds=Parent2.Creds;
		}
		}
	
	public String toString(){

		// returns the students full name and student ID
		
		return this.First_Name+ " " + this.Last_Name + " " + this.Identify;
	}

	public static void main(String[] args) {
	/*
		// TODO Auto-generated method stub
		Student Joe= new Student();
		//System.out.println(Joe.getClassStanding());
		Joe.GPA=3.211;
		Joe.Creds=70;
		Joe.First_Name="Joe";
		Joe.Last_Name="Jonestar";
		Joe.Identify=247;
		Student David= new Student();
		//System.out.println(Joe.getClassStanding());
		David.GPA=3.789;
		David.Creds=88;
		David.First_Name="David";
		David.Last_Name="Moonstar";
		David.Identify=112;
		//Joe.submitGrade(0,3);
		System.out.println(String.valueOf(Joe.Creds));
		System.out.println(String.valueOf(Joe.computeTuition()));
		System.out.println(Joe.toString());
		Student Mark= new Student();
		Mark.createLegacy(Joe, David);
		System.out.println(Mark.toString());
		System.out.println(String.valueOf(Mark.Creds));
		System.out.println(String.valueOf(Mark.GPA));

*/
	}
}
