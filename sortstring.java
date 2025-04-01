import java.util.Scanner;
import java.util.Arrays;

public class sortstring 
	{
   	public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
        
			String[] array = {"abhi", "achu", "adhi", "keedanu", "amina"};
        
			while (true) 
			{
			System.out.println("\nMenu:");
			System.out.println("1. Search for a string in the array");
			System.out.println("2. Sort the array");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); 
            
			switch (choice) 
				{
 				case 1:
 				System.out.print("Enter the string to search: ");
 				String searchString = scanner.nextLine();
				 boolean found = false;
				 for (String s : array)
				 	{
  				 	if (s.equals(searchString))
 						{
 						 found = true;
							break;
 					}
 				}
				if (found)
        				{
					System.out.println("String found in the array.");
					} 
				else 
					{
					System.out.println("String not found in the array.");
					}
				break;
				case 2:
				Arrays.sort(array);
				System.out.println("Sorted array: " + Arrays.toString(array));
				break;
				case 3:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
				default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}

       

