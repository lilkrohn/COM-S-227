package hw1;

/**
 * 
 * Assignment 1
 * @author Lily Krohn
 *
 */
public class Cab {
	
	/**
	 * instance variables here:
	 */
	
	/**
	 * Sets up instance variable for miles
	 */
	private double miles;
	
	/**
	 * Sets up instance variable for totalMiles traveled
	 */
	private double totalMiles;
	
	/**
	 * Sets up instance variable for the initial amount of cash
	 */
	private double startCash = 0;
	
	/**
	 * Sets up instance variable for the total amount of cash
	 */
	private double totalCash;
	
	/**
	 * Sets up instance variable for the meter
	 */
	private double meter = 0;
	
	/**
	 * Sets up instance variable for the initial meter value
	 */
	private double startMeter;
	
	/**
	 * Sets up instance variable for the base fare
	 */
	private double baseFare;
	
	/**
	 * Sets up instance variable for the rate
	 */
	private double rate = 0;
	
	/**
	 * Sets up instance variable for the initial rate
	 */
	private double startRate;
	
	/**
	 * Sets up instance variable for the average income
	 */
	private double averageIncome = 0;
	
	/**
	 * Sets up instance variable for if there is a passenger
	 */
	private boolean passenger;
	
	
	
	
	/**
	 * define values in or after the constructor
	 * @param givenBaseFare 
	 * @param givenPerMileRate
	 */
	public Cab(double givenBaseFare, double givenPerMileRate)
	/**
	 * define values here
	 */
	
	{
		baseFare = givenBaseFare;
		startRate = givenPerMileRate;
	}

	
	
	/**
	 * Drives the cab the given number of miles, 
	 * updating the total miles and possibly updating the meter.
	 * @param miles
	 */
	public void drive(double miles)
	{
		totalMiles = totalMiles + miles;
		meter = meter + rate * miles;
		averageIncome = (totalCash / totalMiles);
	}
	
	
	
	/**
	 * Starts a new ride, setting the meter to the base
	 * fare and setting the current rate to the per mile charge.
	 */
	public void pickUp()
	{
		rate = startRate;
		passenger = true;
		startMeter = baseFare;
		meter = startMeter;
	}
	
	
	
	/**
	 * Ends the current ride, updating the total cash collected
	 *  and resetting the meter and current rate to zero.
	 */
	public void dropOff()
	{
		startCash =  meter;
		meter = 0;
		passenger = false;
		rate = 0;
		totalCash = totalCash + startCash;
		averageIncome = (totalCash / totalMiles);
	}
	
	
	
	/**
	 * Returns the average income earned by 
	 * this cab per mile driven.
	 * @return average income per mile
	 */
	public double getAverageIncomePerMile()
	
	{
		return averageIncome;
	}
	
	
	
	/**
	 * Returns the current per-mile rate, which is always
	 *  either zero or the per-mile rate given in the constructor.
	 *  @return the current per-mile rate
	 */
	public double getCurrentRate()
	
	{
		return rate;
	}
	
	
	
	/**
	 * Returns the amount of money shown on the
	 *  meter for the current ride.
	 *  @return amount of money shown on the meter
	 */
	public double getMeter()
	
	{
		return meter; 
	}
	
	
	
	/**
	 * Returns the total cash collected by 
	 * this cab during its lifetime.
	 * @return total cash collected
	 */
	public double getTotalCash()
	
	{
		return totalCash; 
	}
	
	
	
	/**
	 * Returns the total miles driven by 
	 * this cab during its lifetime.
	 * @return total miles driven
	 */
	public double getTotalMiles()
	
	{
		return totalMiles;
	}
	
	
	
	/**
	 * Determines whether the cab currently
	 *  has a passenger (i.e., the current rate is nonzero).
	 *  @return true if the cab has a passenger, false otherwise
	 */
	public boolean hasPassenger()
	{
		return passenger;
	}
	
	
	
}