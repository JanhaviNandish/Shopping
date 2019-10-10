
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Register 
{
	public static void getCurrentTimeUsingDate()
	{
		Date date = new Date();
		String strDateFormat = "hh:mm:ss a";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate = dateFormat.format(date);
		System.out.println(formattedDate);	
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t\tWELCOME TO SHOPPING MART");
		
		getCurrentTimeUsingDate();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Register account");
		int flag=0;
		while(flag==0)
		{
			try 
			{
				System.out.println("User Name:");
				String s = scan.nextLine();
				if(s.length() != 0)
				{
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 )
					{
					}
					else
					{
						throw new InputMismatchException();
					}		
				}
				flag=1;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("invalid nam...!");
			}
		}
		flag=0;
		while(flag==0)
			{
			try
			{
			System.out.println("Mobile number:");
				String m = scan.nextLine();
				
				for(int i1=0;i1<m.length();i1++)
				{
					if(m.matches("[0-9]+") && m.length()==10)
				{
					
				}
				else
				{
					throw new InputMismatchException();
				}
			}
				flag=1;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input");
			}
		}
		category.category();
	}
}
