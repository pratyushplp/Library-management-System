package libManagementSystem;
//import java.util.regex.*;

public class functionLib {
	
	public books tempBook= new books();
	
	
	public void issueBook(books b,String name1)
	{
		//if(b.checkAvailable(b))
		//{
			b.changeUser(b,name1);
		//}
		
		//else
		//{
		//	System.out.println("the book is not available");
		//}
	}
	
	public void returnBook(books b)
	
	{
		b.returnBook(b);
		b.changeUser(b, "null");
	}
}
	
	

