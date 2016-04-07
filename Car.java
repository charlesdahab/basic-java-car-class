public class Car
{
	private String color;
	private int gear;
	private double speed;
	private int id;
	
	private static int numberOfCars = 0;

	public Car (String initialColor, int startGear, double startSpeed)
	{
		color = initialColor;
		gear = startGear;
		speed = startSpeed;
		
		id = ++numberOfCars;
		
	}

	public int getID()
	{
		return id;
	}
	
	public static int getNumberOfCars()
	{
		return numberOfCars ;
	}

	public String getColor()
	{
		return color;
	}
	
	public void setColor(String newColor)
	{
		color = newColor;
	}
	
	public int getGear()
	{
		return gear;
	}

	public void setGear(int newGear)
	{
		gear = newGear;
	}

	public double getSpeed()
	{
		return speed;
	}

	public void setSpeed(double newSpeed)
	{
		speed = newSpeed;
	}

	public void applybrake(double decrement)
	{
		speed -= decrement;
	}


	public void speedUP(double increment)
	{
		speed += increment;
	}

}
