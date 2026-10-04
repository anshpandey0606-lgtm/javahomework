public class StringParsing{
    public static void main(String[] args) {

        String a = "100";
        String b = "10.5";
        String c = "20.5f";
        String d = "50000";

        int num1 = Integer.parseInt(a);
        double num2 = Double.parseDouble(b);
        float num3 = Float.parseFloat(c);
        long num4 = Long.parseLong(d);

        System.out.println("Integer = " + num1);
        System.out.println("Double = " + num2);
        System.out.println("Float = " + num3);
        System.out.println("Long = " + num4);
    }
}