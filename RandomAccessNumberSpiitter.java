import java.io.*;

public class RandomAccessNumberSplitter {

    public static void main(String[] args) throws IOException {

        // Step 1: Write numbers to numbers.txt using RandomAccessFile

        RandomAccessFile numbersFile = new RandomAccessFile("numbers.txt", "rw");

        for (int i = 1; i <= 20; i++) {

            numbersFile.writeBytes(i + "\n");

        }

        numbersFile.close();

        // Step 2: Read from numbers.txt and separate even and odd

        RandomAccessFile readFile = new RandomAccessFile("numbers.txt", "r");

        RandomAccessFile evenFile = new RandomAccessFile("even.txt", "rw");

        RandomAccessFile oddFile = new RandomAccessFile("odd.txt", "rw");

        String line;

        while ((line = readFile.readLine()) != null) {

            int num = Integer.parseInt(line.trim());

            if (num % 2 == 0) {

                evenFile.writeBytes(num + "\n");

            } else {

                oddFile.writeBytes(num + "\n");

            }

        }

        readFile.close();

        evenFile.close();

        oddFile.close();

        // Step 3: Display contents of all files

        System.out.println("Contents of numbers.txt:");

        displayFile("numbers.txt");

        System.out.println("\nContents of even.txt:");

        displayFile("even.txt");

        System.out.println("\nContents of odd.txt:");

        displayFile("odd.txt");

    }
Initial list:[bat, ball, cap]
Enter a string:
^Cexam@mcet-120-013IL:~/Desktop/code$ gedit awtEg.java^C
exam@mcet-120-013IL:~/Desktop/code$ gedit HouseApplet.java
exam@mcet-120-013IL:~/Desktop/code$ javac  HouseApplet.java

    public static void displayFile(String filename) throws IOException {

        RandomAccessFile file = new RandomAccessFile(filename, "r");

        String line;

        while ((line = file.readLine()) != null) {

            System.out.println(line);

        }

        file.close();

    }

}

