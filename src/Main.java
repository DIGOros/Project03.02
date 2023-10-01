import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Can you please tell me your age?");
        int age = scanner.nextInt();

        String activity;
        if (age <= 6) {
            activity = "Home, walk, and kindergarten.";
        } else if (age <= 17) {
            activity = "School.";
        } else if (age <= 22) {
            activity = "University.";
        } else if (age <= 60) {
            activity = "Work.";
        } else if (age <= 100) {
            activity = "Retired.";
        } else {
            activity = "Wow, you've lived more than 100 years! You should be celebrated!";
        }

        System.out.println("Based on your age, your daily activity is: " + activity);

        scanner.close();
    }
}
