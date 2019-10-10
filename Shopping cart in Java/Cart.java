import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cart
{
	static ArrayList<String> name = new ArrayList<String>();
	static ArrayList<Integer> price = new ArrayList<Integer>();
	static ArrayList<Integer> qty = new ArrayList<Integer>();
	static int item = 0;
	/*public static void add(int a,String s)
	{
		Scanner scan = new Scanner(System.in);
		//name.add(a);
		//price.add(s);
		System.out.println(name);
		System.out.println(price);
		System.out.println("item added to cart");
		//Cart cart = new Cart().add(item);
		item++;
		
		System.out.println("total no of items in the cart is: " +item);
		System.out.println("total amount is: ");
		//getItem();
		System.out.println("continue shopping 1/0");
		int san = scan.nextInt();
		switch(san)
		{
		case 1: System.out.println("continue");
		category.category();
		break;
		case 0:System.out.println("thank you for shopping visit again");
		//break;
		
		}*/
	public static void viewcart()
	{
		if(name.size()!=0)
		{
			Scanner scan = new Scanner(System.in);
			int total=0;
			System.out.println("------------------------------------------------------------");
			System.out.println("sl no \t Item \t\t\t price");
			System.out.println("------------------------------------------------------------");
			for(int i=0;i<name.size();i++)
			{
				System.out.println((i+1)+ "\t" +name.get(i) + "\t\t\t" +price.get(i));
				total+= price.get(i);
			}
			System.out.println("------------------------------------------------------------");
			System.out.println("total price=\t\t\t" +total);
			System.out.println("------------------------------------------------------------");
			System.out.println("1.shop more");
			System.out.println("2.remove");
			System.out.println("3.back");
			System.out.println("4.exit");
			int num = scan.nextInt();
			switch(num)
			{
			case 1:category.category();
			break;
			case 2:remove();
			break;
			case 3:
			break;
			case 4:System.exit(0);
				break;
			}		
		}
		else
		{
			System.out.println("*************cart is empty*****************");
		}
		//Scanner scan = new Scanner(System.in);
		//name.remove(a);
	//	price.remove(s);
	}
	private static void remove()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the serial no of item to be removed");
		int slno = scan.nextInt();
		int slnum = slno-1;
		name.remove(slnum);
		price.remove(slnum);
		Cart.viewcart();
	}
	private static ArrayList<Integer> quantity()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the number of quantity u need");
		int flag=0;
		while(flag==0)
		{
			System.out.print("enter the number of quantity u need");
			int qty = scan.nextInt();
			try
			{
				if(qty!=0)
				{
					flag=1;
				}
				else
				{
					throw new InputMismatchException();
				}
			}	
			catch(InputMismatchException e)
			{
				System.out.println("wrong input");
			}
			
		}
		return qty;
	}
	
	
}
