import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CURRENCY CONVERSION APP!!");
        System.out.print("Input amount (in IDR): ");
        Scanner scanner = new Scanner(System.in);
        double rupiah = scanner.nextDouble();

        Converter converter = new Converter(rupiah);

        System.out.println("Choose your conversion currency:");
        System.out.println("A. USD");
        System.out.println("B. SGD");
        System.out.println("C. JPY");
        System.out.print("Input the conversion currency (Choose A/B/C) : ");
        char choice = scanner.next().charAt(0);

        double result;
        if (Character.toUpperCase(choice) == 'A') {
            result = converter.convertToUSD();
            System.out.printf("Conversion result to USD is %.2f", result);
        } else if (Character.toUpperCase(choice) == 'B') {
            result = converter.convertToSGD();
            System.out.printf("Conversion result to SDG is %.2f", result);
        } else if (Character.toUpperCase(choice) == 'C') {
            result = converter.convertToJPY();
            System.out.printf("Conversion result to JPY is %.2f", result);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}
