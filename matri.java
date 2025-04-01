import java.util.*;
class Matrice
{
 public static void main(String agrs[])
 {
  int s1,s2,i,j,k;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the first array size:");
    s1=sc.nextInt();
    for(i=0;i<s2;i++)
  System.out.println("enter the first array elements:");
    for(i=0;i<s1;i++)
      for(j=0;j<i;j++)
   a[i][j]=sc.nextInt();   
  System.out.println("enter the second size:");
     s2=sc.nextInt();
     for(i=0;i<s1;i++)
  System.out.println("enter the second array elements:");
     for(i=0;i<s2;i++)
      for(i=0;i<i;i++)
   b[i][j]=sc.nextInt();
  int a[][]=new int [i][j];
  int b[][]=new int [i][j];
  int c[][]=new int [i][j];
  System.out.println("addition of two matrix:");
     for(k=0;k<s1+s2;k++)
     
      c[i][j]=a[i][k]+b[j][k];
      System.out.println(c[i][j]);
      System.out.println();
   System.out.println("multiplication of two matrix:");
     for(k=0;k<s1+s2;k++)
      c[i][j]=0;
      c[i][j]=sc.nextInt();
       c[i][j]=c[i][j]+a[i][k]*b[i][j];
       System.out.println(c[i][j]);
       System.out.println(); 
       
 }
}
