import java.util.InputMismatchException;
import java.util.Scanner;

public class Womens
{
	public static void womens() 
	{
		for(;;)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("Choose the wear in womens clothing:\n 1)Tops & Shirts for 600\n 2)Dresses for 900\n 3)Jackets 1200\n 4)Jeans for 800\n 5)Trousers for 500\n 6)Skirt for 550\n 7)view cart");
		System.out.println("----------------------------------------------------------");
		//System.out.println("enter the number");
	//	try
	//	{
			int num = scan.nextInt();
			switch(num)
			{
				case 1: Cart.name.add("Top");
				Cart.price.add(600);
				System.out.println("Item added to cart");
				break;
				
				case 2:  Cart.name.add("Dress");
				Cart.price.add(900);
				System.out.println("Item added to cart");
				break;
				
				case 3:  Cart.name.add("Jacket");
				Cart.price.add(1200);
				System.out.println("Item added to cart");
				break;
				
				case 4: Cart.name.add("jeans");
				Cart.price.add(800);	
				System.out.println("Item added to cart");
				break;
				
				case 5: Cart.name.add("Trousers");
				Cart.price.add(500);
				System.out.println("Item added to cart");
				break;
				
				case 6: Cart.name.add("Skirt");
				Cart.price.add(550);
				System.out.println("Item added to cart");
				break;
				
				case 7:Cart.viewcart();
				break;
				
				default: 
					System.out.println("Enterd Wrong input.....");
				break;
			}
			
	//	catch(InputMismatchException e)
		//{
	//		System.out.println("enter vaild number");
	//		Womens.womens();
	//	}
	//	return 0;

		}
	}
}

