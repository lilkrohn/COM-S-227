package lab5;

public class Basketball {

	private double Diameter;
	
	private boolean inflated;

	public Basketball(double givenDiameter) 
	{
		Diameter = givenDiameter;
	}

	public boolean isDribbleable() 
	{
		if (inflated == true){
			return true;
		}
		else {
			return false;
		}
	}

	public double getDiameter() {
		
		return Diameter;
	}

	public double getCircumference() {
		
		double pi = 3.14;
		return Diameter * pi;
	}

	public void inflate() {
		
		inflated = true;
	}
}
