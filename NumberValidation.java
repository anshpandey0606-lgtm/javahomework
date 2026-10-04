import java.util.Scanner;

public class NumberValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Valid Number");
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}

