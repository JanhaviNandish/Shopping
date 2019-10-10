import java.util.InputMismatchException;
import java.util.Scanner;

public class category 
{
	public static int category()
	{
		for(;;)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("Choose the category:\n1.Mobiles,Laptop\n2.Womens colthing\n3.Mens clothing\n4.Sports,fitness\n0.exit\n9.view cart");
		System.out.println("----------------------------------------------------------");
		//System.out.println("enter the number");
		try
		{
			int num = scan.nextInt();
			switch(num)
			{
				case 1: System.out.println("Mobiles and Laptops");
				Mobiles.mobiles();
				break;
				case 2: System.out.println("Womens clothing");
				Womens.womens();
				break;
				case 3: System.out.println("Mens clothing");
				Mens.mens();
				break;
				case 4: System.out.println("Sports, Fitness");
				Sports.sports();
				break;
				case 0:System.out.println("exit");
				System.exit(0);
				break;
				case 9:Cart.viewcart();
				break;
				default: System.out.println("unknown");
				break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("enter vaild number");
			category();
		}
			return 0;
		
		}
	}
	//Cart.viewcart();
}
