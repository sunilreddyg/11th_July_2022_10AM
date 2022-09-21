package mq.java.methods.Parameters;

public class Method_Parameters
{
	
	//Method with integer parameter
	public void methodA(int a) 
	{
		System.out.println(a);
	}
	
	//method with String parameter
	public void methodB(String str)
	{
		System.out.println(str);
	}
	
	//Method with double parameter
	public void methodC(double dble)
	{
		System.out.println(dble);
	}
	
	//Method with Char parameter
	public void methodD(char ch)
	{
		System.out.println(ch);
	}

	//Method with boolean parameter
	public void methodE(boolean flag)
	{
		System.out.println(flag);
	}
	
	public static void main(String[] args) 
	{
		//Calling methods with Actual parameters/ Arguments
		Method_Parameters obj=new Method_Parameters();
		obj.methodA(100);
		obj.methodB("MQ");
		obj.methodC(1200.12);
		obj.methodD('B');
		obj.methodE(true);
	}
}
