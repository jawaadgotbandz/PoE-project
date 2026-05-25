
import java.util.Scanner;

 public static void main(String[] args) {
     registration registration = new registration();
     registration.Register();

     Scanner scanner = new Scanner(System.in);
     Login login = new Login(registration.Username, registration.Password, registration.firstName, registration.lastName);

     System.out.println("Please log in now.");

     // For loop: maximum 3 attempts

     for (int i = 0; i < 3; i++) {
         System.out.println("Enter username:");
         String loginUser = scanner.nextLine();
         System.out.println("Enter password:");
         String loginPass = scanner.nextLine();

         String message = login.loginUser(loginUser, loginPass);
         System.out.println(message);

         // If login successful, break out of the loop

         if (message.startsWith("Welcome")) {
             break;
         }

         // If it was 3rd attempt, lock the account

         if (i == 2) {
             System.out.println("Too many failed attempts, account locked:");

             }

         }
     }
