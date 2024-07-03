import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Tossing a coin...");
        String[] results = new String[3];
        
        for (int i = 0; i < 3; i++) {
            results[i] = random.nextBoolean() ? "Heads" : "Tails";
            System.out.println("Round " + (i + 1) + ": " + results[i]);
        }
        
        int headsCount = 0;
        int tailsCount = 0;
        for (String result : results) {
            if (result.equals("Heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        
        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
        
        if (headsCount > tailsCount) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
