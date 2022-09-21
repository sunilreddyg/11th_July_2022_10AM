package mq.java.constructor;

public class GearTest 
{

	public GearTest() 
	{
		System.out.println("Hold Clutch");
	}
	
	public void ChangeGear1() 
	{
		System.out.println("Gear1 Changed");
	}
	
	public void ChangeGear2() 
	{
		System.out.println("Gear2 Changed");
	}
	
	public void ChangeGear3() 
	{
		System.out.println("Gear3 Changed");
	}
	
	public static void main(String[] args) 
	{
		//new GearTest();
		new GearTest().ChangeGear1();
		new GearTest().ChangeGear2();
		new GearTest().ChangeGear3();
	}

}
