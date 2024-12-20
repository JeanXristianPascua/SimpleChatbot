import java.util.Scanner;
import java.util.Random;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hello! i'm your chatbot. Type 'exit' to end the conversation.");

        while (true) {
            System.out.println("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            //Exit condition
            if (userInput.equals("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Dynamic responses for specific inputs
            switch (userInput) {
                case "hi":
                case "hello":
                    String[] greetings = {"Hello!", "Hi there!", "Hey!", "Greetings!"};
                    System.out.println("Chatbot: "+ greetings[random.nextInt(greetings.length)]);
                    break;
                case "how are you":
                    String[] moods = {
                            "I'm doing great, thanks for asking",
                            "I'm just a program, but I'm feeling good today!",
                            "All systems are running smoothly",
                            "I'm here to help! How about you?"
                    };
                    System.out.println("Chatbot: " + moods[random.nextInt(moods.length)]);
                    break;
                case "help":
                    String[] helpMessages = {
                            "You can say 'hello', ask 'how about you', or type 'exit' to leave.",
                            "I'm here to assist! Try asking me something fun.",
                            "Type 'exit' to end, or say something and I'll respond!"
                    };
                    System.out.println("Chatbot: " + helpMessages[random.nextInt(helpMessages.length)]);
                    break;
                default:
                    String[] defaultReplies = {
                            "I'm not sure I understand. Can you try rephrasing?",
                            "Hmm, that's interesting! Tell me more.",
                            "I'm still learning. Let's try another question.",
                            "Sorry, I didn't get that. Could you clarify?"
                    };
                    System.out.println("Chatbot: " + defaultReplies[random.nextInt(defaultReplies.length)]);
                    break;
            }
        }
        scanner.close();
    }
}
