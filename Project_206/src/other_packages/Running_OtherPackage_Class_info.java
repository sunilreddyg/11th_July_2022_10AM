package other_packages;


import mq.java.methods.Chrome;
import mq.java.methods.TVRemote;

public class Running_OtherPackage_Class_info 
{

	public static void main(String[] args) 
	{
		
		Chrome obj=new Chrome();
		obj.Openchrome();
		obj.Loadpage();
		
		TVRemote remote=new TVRemote();
		remote.on();
	

	}

}
