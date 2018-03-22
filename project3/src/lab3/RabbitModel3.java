package lab3;

import java.util.Random;
	/**
	 * A RabbitModel is used to simulate the growth
	 * of a population of rabbits. 
	 */
	public class RabbitModel3
	{
	  private int population;
	  private Random rand = new Random(137);
	 
	  
	  /**
	   * Constructs a new RabbitModel.
	   */
	  public RabbitModel3(int givenPopulation)
	  {
		 population = 0;
	  }  
	 
	  /**
	   * Returns the current number of rabbits.
	   * @return
	   *   current rabbit population
	   */
	  public int getPopulation()
	  {
	    // TODO - returns a dummy value so code will compile
	    return population;
	  }
	  
	  /**
	   * Updates the population to simulate the
	   * passing of one year.
	   */
	  public void simulateYear()
	  {
		  population = population + rand.nextInt(11); 
	  }
	  
	  /**
	   * Sets or resets the state of the model to the 
	   * initial conditions.
	   */
	  public void reset()
	  {
		 population = 0;
		 
	  }
	}
