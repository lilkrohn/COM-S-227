package lab5;

import org.junit.Test;

import static org.junit.Assert.*;

import balloon4.Balloon;

/**
 * A newly constructed balloon should have radius zero
 * A newly constructed balloon should not be popped (deflated with radius 0)
 * After calling blow(5) on a balloon with max radius 10, the radius should be 5
 * if radius increases beyond the max, balloon will pop
 * if popped or given a  negative value, the blow() method has no effect
 * if given argument is negative balloon will have a max radius of zero
 * 
 */

public class BalloonTests {
  
	    @Test
	    public void testBlowStart()
	    {
	      Balloon b = new Balloon(10);
	      b.pop();
	      b.blow(1); //if popped or given a  negative value, the blow() method has no effect, does not check if already popped
	      assertEquals(0, b.getRadius());
	    }
	    
	    @Test
	    public void testBlowRegular()
	    {
	      Balloon b = new Balloon(10);
	      b.blow(5); // After calling blow(5) on a balloon with max radius 10, the radius should be 5
	      assertEquals(5, b.getRadius());
	    }

	    @Test
	    public void testBlowX2()
	    {
	      Balloon b = new Balloon(20);
	      b.blow(5); //does not check to see if it is popped before blowing it up again
	      b.blow(5);
	      assertEquals(10, b.getRadius());
	    }

	    @Test
	    public void endPop()
	    {
	      Balloon b = new Balloon(5);
	      b.deflate(); // the deflate will pop the balloon
	      assertEquals(false, b.isPopped());
	    }
	   
}
