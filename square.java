package graphics;
import java.util.*;
public class square
{
	int s,a;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
		System.out.println("enter the side");
		s=sc.nextInt();
		a=s*s;
	}
	public void display()
	{
		System.out.println("area of square"+a);
	}
}
		
