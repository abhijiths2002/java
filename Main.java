import java.util.*;
interface shape
{
	double area();
	double perimeter();
}
class circle implements shape
{
  double radius;
  public circle()
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter radius of circle");
     this.radius=sc.nextDouble();
  }
  public double area()
  {
	return 3.14*radius*radius;
  }
  public double perimeter()
  {
	return 2*3.14*radius;
  }
}
class rectangle implements shape
{	
	int length,width;
	public rectangle()
	{
	  Scanner sc=new Scanner(System.in);
          System.out.println("enter the length of rectangle");
	  this.length=sc.nextInt();
	  System.out.println("enter the width of rectangle");
	  this.width=sc.nextInt();
	  }
          public double area()
          {
	   return length*width;
          }
          public double perimeter()
          {
	     return 2*(length+width);
          }
}
public class Main
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
   int choice;
   do
   {	
     System.out.println("\nMenu");
     System.out.println("\n1.circle");
     System.out.println("\n2.rectangle");
     System.out.println("\n3.exit");
     System.out.println("\nenter your choice");
     choice=sc.nextInt();
     shape Shape=null;
     if(choice==1)
     {
     	Shape=new circle();
     }
     else if(choice==2)
     {
      Shape=new rectangle();
     }
     else if(choice==3)
     {
      System.out.println("exiting");
      break;
     }
     System.out.println("area:"+Shape.area());
     System.out.println("perimeter:"+Shape.perimeter());
 }
 while(choice!=3);
				
	}
}
