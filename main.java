import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (low <= high && !found) {
            int mid = (low + high) / 2;
            System.out.println("Is your number " + mid + "?");
            System.out.print("Enter 'h' if it's higher, 'l' if lower, 'c' if correct: ");
            char response = scanner.next().toLowerCase().charAt(0);

            switch (response) {
                case 'h':
                    low = mid + 1;
                    break;
                case 'l':
                    high = mid - 1;
                    break;
                case 'c':
                    found = true;
                    System.out.println("Yay! I guessed your number: " + mid);
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        }

        if (!found) {
            System.out.println("Hmm, something went wrong. Were you honest? 😜");
        }

        scanner.close();
    }
}
