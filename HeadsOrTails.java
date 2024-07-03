import java.util.Scanner;

public class HeadsOrTailsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.println("Who are you?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Tossing a coin...");

        // Simulate 3 rounds of coin tossing
        int headsCount = 0;
        int tailsCount = 0;
        Random random = new Random();

        for (int i = 1; i <= 3; i++) {
            String result = random.nextBoolean() ? "Heads" : "Tails";
            System.out.println("Round " + i + ": " + result);

            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Print total counts
        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);

        // Determine and print victory message with user name
        if (headsCount > tailsCount) {
            System.out.println(userName + " won!");
        } else {
            System.out.println(userName + " lost!");
        }
    }
}
