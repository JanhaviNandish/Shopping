import java.util.InputMismatchException;
import java.util.Scanner;

public class Mobiles 
{

	public static void mobiles() 
	{
		for(;;)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("Choose the brand in mobiles and laptops:\n1.Honor for 10000\n2.Oppo for 10000\n3.Nokia for 7000\n4.Apple for 70000\n5.HP for 55000\n6.View Cart");
		System.out.println("----------------------------------------------------------");
		//System.out.println("enter the number");
			int num = scan.nextInt();
		
			switch(num)
			{
				case 1: Cart.name.add("Honor");
				//System.out.println("item:Honor     qty:");
				//int qty=scan.nextInt();
				//System.out.println("item:Honor     qty:");
				Cart.price.add(10000);
				Cart.qty.add(null);
				
				System.out.println("Item added to cart");
				break;
				
				case 2: Cart.name.add("Oppo");
						Cart.price.add(10000);
				System.out.println("Item added to cart");
				break;
				
				case 3:  Cart.name.add("Nokia");
				Cart.price.add(7000);
				System.out.println("Item added to cart");
				break;
				
				case 4: Cart.name.add("Apple");
				Cart.price.add(70000);	
				System.out.println("Item added to cart");
				break;
				
				case 5: Cart.name.add("HP");
				Cart.price.add(55000);
				System.out.println("Item added to cart");
				break;
				
				case 6:Cart.viewcart();
				break;
				
				default: 
					System.out.println("Enterd Wrong input.....");
				break;
			}
			
		
		}
	}

}
