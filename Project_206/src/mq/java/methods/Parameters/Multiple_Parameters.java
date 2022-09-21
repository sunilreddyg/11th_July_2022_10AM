package mq.java.methods.Parameters;

public class Multiple_Parameters 
{
	
	//Method  Without Parameter
	public void method1()
	{
		System.out.println("info.dsnr@gmail.com");
	}
	
	
	//Method with Parameter
	public void method2(String email)
	{
		System.out.println(email);
	}
	
	//Method with Multiple Parameters [Sequence Parameters]
	public void method3(String Phone, String Config)
	{
		System.out.println(Phone);
		System.out.println(Config);	
	}
	
	//Method with multipel parameters
	public void method4(String Product,double price,boolean status)
	{
		System.out.println(Product+"\t"+price+"\t"+status);
	}
	

	public static void main(String[] args) 
	{
		
			Multiple_Parameters obj=new Multiple_Parameters();
			obj.method1();
			obj.method2("sunil123@gmail.com");
			obj.method3("90302448855", "128B");
			obj.method4("Iphone", 25000.00,true);
	}

}
