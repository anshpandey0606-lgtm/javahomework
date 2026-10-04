import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers:");

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        }

        System.out.println("Non-integer entered. Program stopped.");
    }
}