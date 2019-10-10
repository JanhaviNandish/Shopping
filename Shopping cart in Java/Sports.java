import java.util.InputMismatchException;
import java.util.Scanner;

public class Sports 
{
	public static void sports() 
	{
		for(;;)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("Choose the sport things in sports & fitness:\n 1)cricket set for 2500\n 2)badminton for 2000\n 3)cycling for 1900\n 4)football for 1500\n 5)treadmills for 10000\n 6)view cart");
		System.out.println("----------------------------------------------------------");
		//	System.out.println("enter the number");
	//	try
	//	{
		
			int num = scan.nextInt();
		
			switch(num)
			{
				case 1: Cart.name.add("cricket set");
				Cart.price.add(1200);
				System.out.println("Item added to cart");
				break;
				
				case 2:  Cart.name.add("badminton");
				Cart.price.add(1900);
				System.out.println("Item added to cart");
				break;
				
				case 3:  Cart.name.add("cycling");
				Cart.price.add(1200);
				System.out.println("Item added to cart");
				break;
				
				case 4: Cart.name.add("football");
				Cart.price.add(1500);	
				System.out.println("Item added to cart");
				break;
				
				case 5: Cart.name.add("treadmill");
				Cart.price.add(10000);
				System.out.println("Item added to cart");
				break;
			
				case 6:Cart.viewcart();
				break;
				
				default: 
					System.out.println("Enterd Wrong input.....");
				break;
			}
			
	//	}
	//	catch(InputMismatchException e)
		//{
		//	System.out.println("enter vaild number");
	//		Sports.sports();
	//	}
	//	return 0;
		}

	}
}
