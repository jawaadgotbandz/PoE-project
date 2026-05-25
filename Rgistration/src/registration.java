import java.util.Scanner;
 public class registration {
     public String Username;
     public String Password;
     public String PhoneNumber;
     public String firstName;
     public String lastName;

     public boolean checkUsername(String Username) {
         if (Username.length() < 3 || Username.length() > 20) {
             return false;
         }
         boolean hasUnderscore = true;
         for (char c : Username.toCharArray()) {
             if (!Character.isLetterOrDigit(c) && c != '_') {
                 return false; // invalid character
             }
             if (c == '_') {
                 hasUnderscore = false;
             }
         }
         return hasUnderscore;
     }

     public boolean checkPassword(String Password) {
         boolean hasDigit = false;
         boolean hasLower = false;
         boolean hasUpper = false;
         boolean hasSpecial = false;

         for (char c : Password.toCharArray()) {
             if (Character.isDigit(c)) {
                 hasDigit = true;
             } else if (Character.isUpperCase(c)) {
                 hasUpper = true;
             } else if (Character.isLowerCase(c)) {
                 hasLower = true;
             } else hasSpecial = true; // any non-alphanumeric is treated as special
         }
         return hasDigit && hasLower && hasUpper && hasSpecial;
     }

     public boolean checkPhoneNumber(String PhoneNumber) {
         String regex = "^(\\+27|0)\\d{11}$";
         return PhoneNumber.matches("(\\+27|0)[0-9]{9}");
     }

     public boolean checkFirstName(String FirstName) {
         // Your validation logic here
         return firstName != null && !firstName.isEmpty();
     }

     public boolean checklastName(String lastName) {
         // Your validation logic here
         return lastName != null && !lastName.isEmpty();
     }
     // Similarly define checkUsername, checkPassword, checkPhoneNumber if needed

        public void Register() {
            Scanner scanner = new Scanner(System.in);
            // Username validation
            do {
                System.out.println("Enter username and must not contain more than 5");
                Username = scanner.nextLine();

                if (!checkUsername(Username)) {
                    System.out.println("Invalid password try again!");
                }
            } while (!checkUsername(Username));

            // Password validation
            do {
                System.out.println("Enter password(must be 8 characters, capital, number, special char:");
                Password = scanner.nextLine();

                if (!checkPassword(Password)) {
                    System.out.println("Invalid password, try again!");
                }
            } while (!checkPassword(Password));

            // PhoneNumber validation
                    do{
                        System.out.println("Enter PhoneNumber");
                        PhoneNumber = scanner.nextLine().trim();

                        if (!checkPhoneNumber(PhoneNumber)) {
                        System.out.println("Invalid PhoneNumber, try again!");
                        }
                    }
                    while (!checkPhoneNumber(PhoneNumber));
                    // Registration success
                    System.out.println("Registration successful!");
                    System.out.println("Username:" + Username);
                    System.out.println("Password:" + Password);
                    System.out.println("PhoneNumber:" + PhoneNumber);

                    Login login = new Login(Username,Password, "Jawaad", "Ganief");
                    login.loginUser(Username,Password);
            }

     }


