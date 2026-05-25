import java.util.Scanner;
import java.util.Random;

void main(){}
    public class QuickChat {
        public static void startChat() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Welcome to Quick Chat");
                System.out.println("Select transaction");
                System.out.println("Option 1 - Select QuickChat");
                System.out.println("Option 2 - Send QuickChat");
                System.out.println("Option 3 - Quit");

                System.out.println("Enter your choice (1,2 or 3):");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {

                    case 1:
                        System.out.println("You selected: Select Quickchat");
                        System.out.println("This feature is coming soon, please stay tuned");// Placeholder for future Quickchat selection logic
                        break;

                    case 2:
                        System.out.println("You selected: Send quick chat");

                        String recipient;

                        do {
                            System.out.println("Enter your number(must start with +27 and be exactly 12 characters):");
                            recipient = scanner.nextLine();
                        } while (!(recipient.startsWith("+27") && recipient.length() == 12));

                        System.out.println("Enter your Quick chat (must be 250 characters or less):");
                        String message = scanner.nextLine();

                        if (message.length() > 250) {
                            System.out.println("Please enter a Quick chat of less than 250 characters");
                            break;
                        }

                        String messageId = generateMessageId();
                        int messageCount = 0;
                        int currentMessageCount = ++messageCount;
                        String messageHash = generateMessageHash(messageId, currentMessageCount, message);

                        System.out.println("MessageHash:" + messageHash);

                        System.out.println("Choose an option:");
                        System.out.println("Option 1 - Send quick chat");
                        System.out.println("Option 2 - Disregard quick chat");
                        System.out.println("Option 3 - Store Quick chat to send later");

                        int subchoice = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        switch (subchoice) {
                            case 1:
                                System.out.println("Sent and stored you son of a n");
                                StoreMessage(messageId, recipient, messageHash);
                                break;

                            case 2:
                                System.out.println("Message deleted");
                                break;

                            case 3:
                                System.out.println("Stored bith");
                                StoreMessage(messageId, recipient, message);
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("Quit");
                        return;

                    default:
                        System.out.println("Invalid choice, try again");
                }
            }
        }


        private static String generateMessageHash(String messageId, int count, String message) {
            //Split the message into words
            String[] words = message.trim().split("\\s+");

            // Get the last word
            String first = words.length > 0 ?
                    words[0] : "";

            //Get the last word
            String last = words.length > 1 ?
                    words[words.length - 1] : first;

            // Get the first two characters of the message ID

            String idPart = messageId.length() >= 2 ? messageId.substring(0, 2) : messageId;

            // Build and return the hash
            return idPart + ":" + count + ":" + first.toUpperCase() + last.toUpperCase();
        }

        private static String generateMessageId() {
            Random random = new Random();
            String id = "";

            //Generate a 10-digit random number
            for (int i = 0; i < 10; i++) {
                id = id + random.nextInt(10);
            }

            // Return the generate ID
            return id;
        }

        public static void StoreMessage(String id, String recipient, String message) {
            try (FileWriter file = new FileWriter("Stored_message.text", true)) {
                file.write("MessageId:" + id + "\n");
                file.write("Recipient:" + recipient + "\n");
                file.write("Message:" + message + "\n");
                file.write("Hash:" + "\n");
                file.write("----\n"); // Separator

                System.out.println("Message stored successfully in text file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





