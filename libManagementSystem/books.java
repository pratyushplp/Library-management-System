package libManagementSystem;

public class books {
	private String name,author,user;
	int id;
	
	public books()
	{
		
	}
	public books(String name, String author,int id, String user)
	
	{
		this.name=name;
		this.author=author;
		this.id=id;
		this.user=user;
		
		
			
		
	}
	
	public books(books b)
	{
		this.name=b.name;
		this.author=b.author;
		this.id=b.id;
		this.user=b.user;
		
		
	}
	
	public boolean checkAvailable(books b)
	{
		if (b.user.matches("null"))
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void changeUser(books b,String s)
	
	{
		b.user=s;
		
	}
	
	public void returnBook(books b)
		{
			b.user=null;
		}
	
	public int getId(books b)
	{
		return(b.id);
	}
	
	public String getName(books b)
	{
		return(b.name);
	}
	public void getname(books b)
	{
		System.out.println(b.name);
	}
	public void infoBook(books b)
	{
		System.out.println("Id: "+b.id+"\r\n"+"name: "+b.name+"\r\n"+"author: "+b.author+"\r\n"+"user: "+b.user+"\r\n");
	}
	
	

	

}
