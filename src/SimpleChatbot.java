import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! i'm your chatbot. Type 'exit' to end the conversation.");

        while (true) {
            System.out.println("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            //Exit condition
            if (userInput.equals("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Simple responses
            switch (userInput) {
                case "hi":
                case "hello":
                    System.out.println("Chatbot: Hello! How can I assist you today?");
                    break;
                case "how are you":
                    System.out.println("Chatbot: I'm doing great! How about you?");
                    break;
                case "help":
                    System.out.println("Chatbot: You can say 'hello', ask 'how are you', or type 'exit' to leave.");
                    break;
                default:
                    System.out.println("Chatbot: Sorry, I didn't understand that. Try asking something else.");
                    break;
            }
        }
        scanner.close();
    }
}
