/*
* A program for atomic mass, atomic charge, and decay
*/
package lab2;

public class Atom 
{
	public static void main(String[] args){}
	
	/*
	 * instance variables
	 */
	private int protons;

	private int neutrons;

	private int electrons;

	/*
	 * Constructor
	*/
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons)
	{
			protons = givenProtons;

			neutrons = givenNeutrons;

			electrons = givenElectrons;
	}

	/*Begin Methods*/
	
	/*
	 * returns number of protons and neutrons combined
	*/
	public int getAtomicMass()
	{
		int atomicMass = (protons + neutrons);

		return atomicMass;
	}

	/*
	 * returns the difference between electrons and protons
	*/
	public int getAtomicCharge()
	{
		int atomicCharge = (protons - electrons);

		return atomicCharge;
	}

	/*
	 * decreases the protons and neutrons by - 2 each
	*/
	public void decay()
	{
		protons = protons - 2;

		neutrons = neutrons - 2;
	}
}