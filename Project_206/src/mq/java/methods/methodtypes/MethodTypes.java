package mq.java.methods.methodtypes;


public class MethodTypes 
{
	//Void method doesn't return any value
	public void SetName() 
	{
		System.out.println("Mindq");
	}
	
	/*
	 * => Otherthan void all methods return values
	 * => For other methods we should write return keyword at end fo the method
	 * => Return value should match with method type
	 * => Finally Value return to methodname
	 */
	
	//string return method
	public String GetName()
	{
		String name="Selenium";
		return name;
	}
	
	//Integer return method
	public int GetNumber()
	{
		return 100;
	}
	
	//boolean return method
	public boolean GetStatus()
	{
		return true;
	}
	
	//Double return method
	public double GetPrice()
	{
		return 12000.00;
	}
	
	//Char return method
	public char GetCode()
	{
		return 'C';
	}
	
	public static void main(String[] args) 
	{
		MethodTypes obj=new MethodTypes();
		obj.SetName();
		
		//Calling return type method
		String str=obj.GetName();
		System.out.println(str);
		
		int num=obj.GetNumber();
		System.out.println(num+100);
		
		boolean flag=obj.GetStatus();
		System.out.println(flag);
		
		double price=obj.GetPrice();
		System.out.println(price);
		
		char code=obj.GetCode();
		System.out.println(code);
		
	}

}
