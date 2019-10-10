import java.util.InputMismatchException;
import java.util.Scanner;

public class Mens 
{
	public static void mens() 
	{
		for(;;) 
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the wear in mens clothing:\n 1)shirts for 700\n 2)jackets for 650\n 3)sweaters for 900\n 4)jeans 800\n 5)trouser for 650\n 6)shorts for 400\n 7)view cart");
		System.out.println("enter the number");
	//	try
	//	{
		
			int num = scan.nextInt();
		
			switch(num)
			{
				case 1: Cart.name.add("shirt");
				Cart.price.add(700);
				System.out.println("Item added to cart");
				break;
				
				case 2:  Cart.name.add("jecket");
				Cart.price.add(650);
				System.out.println("Item added to cart");
				break;
				
				case 3:  Cart.name.add("sweater");
				Cart.price.add(900);
				System.out.println("Item added to cart");
				break;
				
				case 4: Cart.name.add("jeans");
				Cart.price.add(800);	
				System.out.println("Item added to cart");
				break;
				
				case 5: Cart.name.add("trousers");
				Cart.price.add(650);
				System.out.println("Item added to cart");
				break;
				
				case 6: Cart.name.add("shorts");
				Cart.price.add(400);
				System.out.println("Item added to cart");
				break;
				
				case 7:Cart.viewcart();
				break;
				
				default: 
					System.out.println("Enterd Wrong input.....");
				break;
			}
			
	//	}
	//	catch(InputMismatchException e)
	//	{
	//		System.out.println("enter valid number");
	//		Mens.mens();
	//	}
	//	return 0;
		}
	}
}
