package mq.java.methods.Parameters;

public class Calculator 
{
	int a=0;
	int b=0;
	
	//Constructor also accept parameters
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
			//Calling Constrcutor with Argument values
			new Calculator(100, 30).add();
			new Calculator(120, 120).add();
			new Calculator(12, 5).mul();
			
			Calculator obj=new Calculator(100, 200);
			obj.add();
			obj.mul();
	}
	

}
