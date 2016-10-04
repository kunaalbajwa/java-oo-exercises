import static org.junit.Assert.*;

import org.junit.Test;

/*

public double Distance(Robot bender)
{
	double dist;
	dist=Math.sqrt(Math.pow(xpos-bender.xpos,2)+Math.pow(ypos-bender.ypos,2));
	return dist;
*/

public class RobotTest {

	@Test
	public void testUpdate() {
		Robot a =new Robot("r2d2", 7,7, 27, 1);
	a.Update();
	}
	
	
	@Test
	public void testDistance()
	{
		Robot d= new Robot("starMap", 6,8, 28, 2);
		Robot a =new Robot("r2d2", 7,7, 27, 1);
		d.Distance(a);
	}

}


