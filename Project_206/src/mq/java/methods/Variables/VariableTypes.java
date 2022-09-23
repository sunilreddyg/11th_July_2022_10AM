package mq.java.methods.Variables;


public class VariableTypes 
{
	//Global variable [Instant Variable]
	String email="info.dsnr@gmail.com";
	String phone="9030248855";
	
	//Global Variable [Static Varaible]
	static int a=100;
	static int b=200;
	
	public void method1()
	{
		String name="WebDriver";  //Local  Variable
		System.out.println(name);
	}
	
	public void method2()
	{
		System.out.println(email);
		System.out.println(phone);
	}


	public static void main(String[] args) 
	{
		
		VariableTypes obj=new VariableTypes();
		obj.method1();
		System.out.println(obj.email);
		System.out.println(obj.phone);
		
		//Calling static variable
		System.out.println(VariableTypes.a);
		System.out.println(VariableTypes.b);
		
		
		
	}

}
