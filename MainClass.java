import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import libManagementSystem.books;
import libManagementSystem.databaseLib;
import libManagementSystem.functionLib;


public class MainClass {

	private static databaseLib database=new databaseLib();
	private static functionLib function=new functionLib();
	private static  Scanner sc =new Scanner(System.in);
	private static boolean run=true;
	private static int count=0;


	public static void case6()
	{
		boolean operate=true;
		while(operate)
		{
			System.out.println("Entern the name of the book");
			String tempA=sc.next().toLowerCase();
			database.searchBook2(tempA);
			if(sc.nextInt()==0)
			{
				operate=false;
			}
		}
	}
	
	public static void case7()
	{
		boolean operate=true;
		while(operate)
		{
			System.out.println("Entern the name of the book");
			String tempA=sc.next().toLowerCase();
			database.searchBook(tempA);
			
			if(sc.nextInt()==0)
			{
				operate=false;
			}
		}
	}
	
	
	
		
	


	public  static void case1(){
		boolean operate=true;
		while(operate)
		{
			sc.nextLine();
			System.out.println("Enter the name of the book");
			String tempA=sc.nextLine();
			System.out.println("Enter the author of the book");
			String tempB=sc.nextLine();
			System.out.println("Enter the user of the book");
			String tempD=sc.nextLine();
			System.out.println("Enter the id of the book");
			int tempC=sc.nextInt();
					
			books b1= new books(tempA,tempB,tempC,tempD);
			database.addBook(b1);
			b1.getname(b1);
			
		
			if(sc.nextInt()==0)
			{
				operate=false;
			}


		}
	}

	public static void case2()
	{
		boolean operate=true;
		while(operate)
		{
			sc.nextLine();
			System.out.println("Enter the name of the book you want to remove");
			String tempE=sc.nextLine().toLowerCase();
			System.out.println("Enter the id of the book you want to remove");
			int tempF=sc.nextInt();
			int count=0; 

			for(books b:database.returnList())
			{
				//System.out.println(b.getName(b));
				if(b.getName(b).matches(tempE)) //&& b.getId(b)==tempF)
				{
					database.remove(b);
					System.out.println("Successfully removed");
					operate=false;
					count=1;

				}				
			}
			if(count==0)
			{
				System.out.println("Invalid information,  pleasee try again");
				/*try {
					TimeUnit.SECONDS.sleep( 1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 */
			}
			if(sc.nextInt()==0)
			{
				operate=false;
			}
		}

	}

	

	public static void case3()
	
	{
		boolean operate=true;
		while(operate)
		{
			sc.nextLine();
			System.out.println("Enter the name of the book you want to update");
			String tempA=sc.nextLine();
			System.out.println("Enter the id of the book you want to update");
			int tempB=sc.nextInt();
			int count=0;
			for(books b:database.returnList())
			{
				if(b.getName(b).matches(tempA) )//&& b.getId(b)==tempB)
				{
					sc.nextLine();
					System.out.println("START UPDATE OPERATION");
					System.out.println("Enter the name of the book");
					String tempC=sc.nextLine();
					System.out.println("Enter the author of the book");
					String tempD=sc.nextLine();
					int tempE= b.getId(b);
					System.out.println("Enter the user of the book");
					String tempF=sc.nextLine();
					database.update(b,tempC,tempD,tempE,tempF);
					count=1;
					System.out.println("Successfully Updated");
	
				}

		}
		
		if(count==0)
		{
				
				System.out.println("Invalid information,  pleasee try again");
				try {
					TimeUnit.SECONDS.sleep( 1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		
		if(sc.nextInt()==0)
		{
			operate=false;
		}
		}
		
		
		
		}
	
	public static void case4()
	{
		
		boolean operate=true;

		while(operate)
		{
		//System.out.println("hello");
		sc.nextLine();
		System.out.println("Enter the name of the user");
		String tempA=sc.nextLine();
		System.out.println("Enter the name of the book");
		String tempB=sc.nextLine();
		System.out.println("Enter the id of the book");
		int tempC=sc.nextInt();
		int count=0;
		for(books b:database.returnList())
		{
			if(b.getName(b).matches(tempB) && b.getId(b)==tempC)
			{
				function.issueBook(b,tempA);
				System.out.println("Successfully issued");
				count=1;

			}
		}
		if(count==0)
		{
				
				System.out.println("Invalid information,  pleasee try again");
				try {
					TimeUnit.SECONDS.sleep( 1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		
		if(sc.nextInt()==0)
		{
			operate=false;
		}
	}
	}
	
	public static void case5()
	{
		
		boolean operate=true;

		while(operate)
		{
		//System.out.println("hello");
		sc.nextLine();
		System.out.println("Enter the name of the user");
		String tempA=sc.nextLine();
		System.out.println("Enter the name of the book");
		String tempB=sc.nextLine();
		System.out.println("Enter the id of the book");
		int tempC=sc.nextInt();
		int count=0;
		for(books b:database.returnList())
		{
			if(b.getName(b).matches(tempB) && b.getId(b)==tempC)
			{
				function.returnBook(b);
				System.out.println("Successfully returned");
				count=1;

			}
		}
		if(count==0)
		{
				
				System.out.println("Invalid information,  pleasee try again");
				try {
					TimeUnit.SECONDS.sleep( 1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		
		if(sc.nextInt()==0)
		{
			operate=false;
		}
	}
	}





	public static void main(String args[]) {



		while(true)
		{
			System.out.println("Main Loop");
			System.out.println("For Admin enter 1 \r\nFor Student enter 2 ");
			int temp1 =sc.nextInt();
			run=true;
			if(temp1==1)
			{
				while(run) {
					System.out.println("Second Loop");

				System.out.println("OPERATIONS \r\n To add book enter 1 \r\n To remove book enter 2 \r\n To update book enter 3 \r\n To issue book enter 4\r\n To return book enter 5\r\n To search book enter 6\r\n For detailed search enter 7 \r\n press 0 to go back from any window");
				int temp2=sc.nextInt();
				
				if(temp2==1)
				{
					case1();
				}

				else if(temp2==2)
				{
					case2();
				}

				else if(temp2==3)
				{
					case3();
				}
				
				else if(temp2==4)
				{
					case4();
				}
				
				else if(temp2==5)
				{
					case5();
				}
				
				
				else if(temp2==6)
				{
					case6();
				}
				else if(temp2==7)
				{
					case7();
				}
				
				else if(temp2==0)
				{
					run=false;
					temp1=0;
				}

			}
			}
			if (temp1==2)
			{
				System.out.println("OPERATIONS \r\n To search book enter 1\r\n press 0 to go back from any window");
				while(run)
				{
					sc.nextLine();
					int temp2=sc.nextInt();
					if(temp2==1)
					{
					case6();
					}
					if(sc.nextInt()==0)
					{
						run=false;
					}
					
					else {
						System.out.println("Invalid input");
				}
					
			}
			
			
				
			}
		
		}

	}
}





