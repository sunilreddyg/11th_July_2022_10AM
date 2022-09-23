package mq.java.methods.methodtypes.ReferenceClass;

public class Product 
{
	//instant variables
	String Name="Iphone";
	double price=25000.00;
	
	
	//Instant Method
	public void PrintDetails()
	{
		System.out.println(Name+"    "+price);
	}
	
	public String  GetName()
	{
		return Name;
	}
	
	public double GetPrice()
	{
		return price;
	}

}
