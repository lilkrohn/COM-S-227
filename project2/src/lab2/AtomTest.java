/*

 * A program for printing the atomic mass, atomic charge, and decay of a Uranium-238 atom

 */

package lab2;


public class AtomTest 

{

	public static void main(String[] args)

	{

	/*

	 * Defines the atom and its protons, neutrons, and electrons

	 */

	Atom a;

	a = new Atom(92, 146, 92);

	

	/*

	 * Prints the atomic mass and atomic charge of the atom

	 */

	System.out.println("Atomic Mass: " + a.getAtomicMass());

	System.out.println("Atomic Charge: " + a.getAtomicCharge());

	

	/*

	 * Implements decay on the atom

	 */

	a.decay();

	

	/*

	 * Prints the decayed atomic mass and atomic charge of the atom

	 */

	System.out.println("Decayed Atomic Mass: " + a.getAtomicMass());

	System.out.println("Decayed Atomic Charge: " + a.getAtomicCharge());

	

	}

}