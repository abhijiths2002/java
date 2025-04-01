import java.util.*;
class largest
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter three numbers");
a=sc.nextInt();
sc.nextLine();
b=sc.nextInt();
sc.nextLine();
c=sc.nextInt();
if(a>b && a>c)
System.out.println("a is larger"+a);
else if(b>c)
System.out.println("b is larger"+b);
else
System.out.println("c is larger"+c);
}
}

