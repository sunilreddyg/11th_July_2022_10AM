package mq.java.methods.methodtypes;

public class Math 
{
	int x;
	int y;
	
	public void SetValues(int a, int b)
	{
		x=a;
		y=b;
	}
	
	public int GetTotal()
	{
		return x+y;
	}
	
	public static void main(String[] args) 
	{
		
		Math obj=new Math();
		
		//Calling void method
		obj.SetValues(100, 200);
		
		//Calling Return type method
		int total=obj.GetTotal();
		System.out.println(total+100);
	}

	
}
