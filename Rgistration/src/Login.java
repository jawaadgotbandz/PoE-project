import java.util.Scanner;
public class Login {
    Scanner scanner = new Scanner(System.in);
    private String Username;
    private String Password;
    private String firstName;
    private String lastName;
    private Object QuickChat;

// Constructor with validation

    public Login(String Username, String password, String firstName, String lastName) {
        this.Username = Username;
        this.Password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

// Method to attempt login

    public String loginUser(String loginUser, String loginPass) {
        if (loginUser.equals(this.Username) && loginPass.equals(this.Password)) {
            // Call Quick chat menu - lowercase 'startChat' QuickChat.startChat();
            System.out.println( "Welcome" + firstName + " " + lastName + ". It is great to see you again!!"); // Must start with Welcome
            System.out.println("Login successful");
            QuickChat.hashCode();
            return "Bye Bye";
        } else {
            return "Invalid password try again!"; // Or check which one failed
        }
    }
}
