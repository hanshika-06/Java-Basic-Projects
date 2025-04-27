import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects");
        int number = sc.nextInt();

        int[] marks = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the marks of " + (i + 1) + " Subject");
            marks[i] = sc.nextInt();
        } // <-- Corrected bracket placement

        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + marks[i];
        }

        System.out.println("Total Marks: " + sum);
        sc.close(); // Close Scanner to avoid resource leak
    }
}
