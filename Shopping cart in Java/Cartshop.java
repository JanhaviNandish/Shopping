import java.util.ArrayList;
import java.util.Arrays;

public class Cartshop
{
	static ArrayList b = new ArrayList();
	Object cart[];
	static int size;
	
	public Cartshop()
	{
	 cart = new Object[10];
	}
	
	public int add(Object item)
	{
		if(cart.length<=5)
		{
			increaseSize();
		}
		cart[size++]=item;
		return 0;
	}
	public  void increaseSize()
	{
		cart=Arrays.copyOf(cart,cart.length*2);
	}
	public void remove(int index)
	{
		if(index>=size)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			cart[index]=null;
			int t=index;
			while(t<size)
			{
				cart[t]=cart[t+1];
				cart[t+1]=null;
				t++;
			}
			size--;
		}
	}
	public int getSize()
	{
		return size;
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(cart[i]);
		}
	}
}
