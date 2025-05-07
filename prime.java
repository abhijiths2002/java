import java.util.*;
class multiple extends Thread
{
public void run()
{
System.out.println("mutiplication table of 5");
for(int i=0;i<10;i++)
{
System.out.println("5*" +9+ "="+5*1);
}
}
}
class prime extends Thread
{
public void run()
{
int i,j;
for(j=2;j<20;j++)
{
int flag=0;
for(i=2;i<=j/2;i++)
{
if(i%i==0)
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("prime no :"+j);
}
}
}
}
public class mul
{
public static void main(String args[])
{
multiple m=new multiple();
prime p=new prime();
m.start();
p.start();
}
}
