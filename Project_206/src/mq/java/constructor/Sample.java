package mq.java.constructor;

public class Sample
{
	//Constructor available in hidden position
	
	public void method1()
	{
		System.out.println("Method 1 Executed");
	}

	
	public static void main(String[] args) 
	{
		new Sample().method1();
		//  new Classname().methodname();
	}
}
