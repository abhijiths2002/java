import java.util.*;

interface Readable
{
   public void read();
}

interface Writable
{
   public void write();
}

class Book implements Readable,Writable
{
   int bid;
   String btitle;
   
   public void read()
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the Book Id: ");
      bid=sc.nextInt();
      sc.nextLine();
      System.out.print("Enter the Book Title: ");
      btitle=sc.nextLine();
   }
   
   public void write()
   {
      System.out.println("Book Details");
      System.out.println("Book Id: " + bid);
      System.out.println("Book Title: " + btitle);
   }
   
 }
 
 public class Interfaceeg
 {
     public static void main(String[] args)
     {
         Book mybook=new Book();
         mybook.read();
         mybook.write();
      }
}
      
      
