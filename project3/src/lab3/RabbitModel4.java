package lab3;
	/**
	 * A RabbitModel is used to simulate the growth
	 * of a population of rabbits. 
	 */
	public class RabbitModel
	{
	  private int population;
	  private int lastYear;
	  private int yearBefore;
	  
	  /**
	   * Constructs a new RabbitModel.
	   */
	  public RabbitModel(int givenPopulation)
	  {
		
		 lastYear = 1;
		 yearBefore = 0;
		 population = 1;
	    
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
		  lastYear = population;
		  yearBefore = lastYear;
		  population = lastYear + yearBefore;
	  }
	  
	  /**
	   * Sets or resets the state of the model to the 
	   * initial conditions.
	   */
	  public void reset()
	  {
		 population = 1;
		 
	  }
	}