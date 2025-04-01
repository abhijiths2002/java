import java.util.*;
public class area
{
public void area(int length,int breadth)
{
int area=length*breadth;
System.out.println("area of rectangle:"+area);
}
public void area(int side)
{
int area=side*side;
System.out.println("area of square:"+area);
}
public void area(double base1,double base2,double height)
{
double area=0.5*(base1+base2)*height;
System.out.println("area of trapizium:"+area);
}
public static void main(String args[])
{
area cal=new area();
Scanner sc=new Scanner(System.in);
System.out.println("enter the length");
int length=sc.nextInt();
sc.nextLine();
System.out.println("enter the breadth");
int breadth=sc.nextInt();
sc.nextLine();
cal.area(length,breadth);
System.out.println("enter the side");
int side=sc.nextInt();
sc.nextLine();
cal.Area(side);
System.out.println("enter the base1,base2,height");
double base1=s
create a class person with data member name,gender,address,age and a constructor to initialize the data members and another class employee that inherit the properties of class person and alsao contains its own datamembers like empid,company_name,qualification,salary and its own constructor.create another class teacher that inherits the property of class employee and contains its own data members like subject,department.teacherid and also  contain constructors and methods to display the data members.use the array of object to  display details of n teachers 
give the java code

