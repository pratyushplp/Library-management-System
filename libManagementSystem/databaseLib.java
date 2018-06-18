package libManagementSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.io.Serializable;

public class databaseLib {

	private List<books> libBook= new CopyOnWriteArrayList<books>();

	public databaseLib() {
		books b1 = new books("ishan","adangol",1,"auttam");
		books b2 = new books("kishan","bdangol",2,"null");
		books b3 = new books("nishan","cdangol",3,"cuttam");
		books b4 = new books("hishan","ddangol",4,"duttam");
		libBook.add(b1);
		libBook.add(b2);
		libBook.add(b3);
		libBook.add(b4);
	}
	public void addBook(books b)
	{
		System.out.println(libBook.add(b));				

	}

	public void remove(books b)
	{
		libBook.remove(b);
	}

	public void update(books b,String name1,String author1,int id1,String available1)
	{
		int temp=libBook.indexOf(b);
		books up = new books(name1,author1,id1,available1);
		b= new books(up);
		libBook.add(temp,up);

	}

	public List<books> returnList() 
	{

		return libBook;


	}
	public void searchBook(String name)
	{
		int count=0;
		for(books b:libBook)
		{
			if(b.getName(b).matches(name) && b.checkAvailable(b))
			{
				System.out.println("The book is available in the library");
				b.infoBook(b);
				count=1;

			}
			else if(b.getName(b).toLowerCase().matches(name) && !b.checkAvailable(b))
			{
				System.out.println("The book is present in the library but is currently taken by another student");
				b.infoBook(b);
				count=1;
			}
		}

		if(count==0) {
			System.out.println("The book is not available in the library");

		}
	}


	

	public void searchBook2(String name)
	{
		int count=0;
		for(books b:libBook)
		{
			if(b.getName(b).toLowerCase().matches("[0-9 a-zA-Z]*"+name.toLowerCase()+"[0-9 a-zA-Z]*"))
			{
				b.infoBook(b);
				count=1;
			}
			
		}
		if(count==0)
		{
			System.out.println("The book is not available in the library");
		}
	}


}





