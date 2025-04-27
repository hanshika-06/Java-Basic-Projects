import java.util.Random;
import java.util.Scanner;

public class GuessingNumbers {
    @SuppressWarnings("resource")
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100");
        System.out.println();

        int range = 100;
        int number = random.nextInt(range) + 1;

        System.out.println("There are 10 attempts to guess the number");
        int attempts = 10;

        boolean result = false ;

        for(int i=attempts; i > 0;){
            System.out.println("Guess the number:");
            int guess = scanner.nextInt();
            i--;
            if(guess == number){
                result = true ;
                break;
            }
            else if (guess > number){
                System.out.println("<--Your guess is too high.-->");
                System.out.println("Attempts left:" + i);
            }
            else if (guess < number){
                System.out.println("<--Your guess is too low.-->");
                System.out.println("Attempts left:" + i);
            }

        }

        if (result == true){
            System.out.println("<-Congratulations, you guessed the number!->");
        }
        else {
            System.out.println("<--Sorry the correct number--> " + number);
        }
    }
}
