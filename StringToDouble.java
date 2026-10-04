public class StringToDouble {
    public static void main(String[] args) {

        String price = "499.99";

        double amount = Double.parseDouble(price);
        double result = amount + 50;

        System.out.println("Final Price = " + result);
    }
}
