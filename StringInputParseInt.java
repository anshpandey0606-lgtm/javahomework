import java.util.Scanner;

public class StringInputParseInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        int number = Integer.parseInt(input);

        System.out.println("Number = " + number);

        sc.close();
    }
}