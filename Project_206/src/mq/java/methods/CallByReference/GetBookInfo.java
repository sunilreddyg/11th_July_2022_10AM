package mq.java.methods.CallByReference;



public class GetBookInfo 
{
	//Method with Datatype as parameters
	public void VerifyBookStatus(boolean flag)
	{
		System.out.println("Book Available status is --> "+flag);
	}
	
	//Methdo with Class as parameter
	public void GetPrice(Book book)
	{
		System.out.println(book.price);
	}
	
	public void GetName(Book book)
	{
		System.out.println(book.Title);
	}
	
	public void GetAllDetails(Book book)
	{
		book.PrintBookDetails();
	}
	
	public static void main(String[] args)
	{
		GetBookInfo info=new GetBookInfo();
		info.VerifyBookStatus(true);
		
		//Calling methods with Class Reference
		info.GetName(new Book());
		info.GetPrice(new Book());
		info.GetAllDetails(new Book());
		
		
	}

}
