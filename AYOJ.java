import java.util.Scanner;

public class AYOJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int caloriesBurned = scanner.nextInt();

        int totalCalories = 0;
        for (int i = 0; i < days; i++) {
            int calories = scanner.nextInt();
            totalCalories += calories - caloriesBurned;
        }

        if (totalCalories < 0) {
            System.out.println(-totalCalories);
        } else {
            System.out.println("NO");
        }
    }
}