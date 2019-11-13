package names;

import java.util.Scanner;
public class name 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a = "YES";
		
		
		
		while (a == "YES")
		{
			System.out.print("Enter a name >>> ");
			String name = sc.nextLine();
			
			
			
			if (name.toUpperCase().equals("ALI"))
			{
				System.out.print(name.toUpperCase() + " is a dumbass");
			}
			else
			{
				System.out.println(name.toUpperCase() + " is amazing!!!!!");
			}
			System.out.println("\n");
			
			
			
			int i = 0;
			System.out.print("Do you want to enter someone else's name yes or no  >>> ");
			String newName = sc.nextLine();
			System.out.println("");
					
			while ( i == 0)
			{
				if(newName.toUpperCase().equals("YES"))
				{
					i++;
				}
				else if (newName.toUpperCase().equals("NO"))
				{
					i++;
					a = "NO";
				}
				else
				{
					
					System.out.print("Could not identify please reenter yes or no >>> " );
					newName = sc.nextLine();
					i = 0; 
				}
				System.out.println();
			}
			 
			
			
		}

	}

}
