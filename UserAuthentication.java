import java.util.Scanner;
class AuthenticationException extends Exception {
public AuthenticationException(String message) {
super(message);
}
}
public class UserAuthentication {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("=== Sign Up ===");
System.out.print("Enter new username: ");
String setUsername = scanner.nextLine();
System.out.print("Enter new password: ");
String setPassword = scanner.nextLine();
System.out.println("\n=== Login ===");
System.out.print("Enter username: ");
String inputUsername = scanner.nextLine();
System.out.print("Enter password: ");
String inputPassword = scanner.nextLine();
try {
if (!inputUsername.equals(setUsername) || !inputPassword.equals(setPassword)) {
throw new AuthenticationException("Login failed: Incorrect username or password!");
}
System.out.println("Login successful! Welcome, " + inputUsername + "!");
} catch (AuthenticationException e) {
System.out.println(e.getMessage());
}
}
}

