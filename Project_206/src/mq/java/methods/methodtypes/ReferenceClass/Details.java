package mq.java.methods.methodtypes.ReferenceClass;

public class Details
{
	
	
	public Product SelectProduct()
	{
		return new Product();
	}
	
	public static void main(String args[])
	{
		Details obj=new Details();
		
		obj.SelectProduct().Name="Samsung";
		String Name=obj.SelectProduct().GetName();
		System.out.println(Name);
	
	}

}
