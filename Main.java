import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = Integer.parseInt(scanner.nextLine());
        System.out.print("Annual Interest Rate: ");
        double interestRate = Double.parseDouble(scanner.nextLine()) / (100 * 12);
        System.out.print("Period (Years): ");
        int period = Integer.parseInt(scanner.nextLine()) * 12;
        double mortgage = (principal * (interestRate * Math.pow((1 + interestRate),period)))/(Math.pow((1 + interestRate), period) - 1);
        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}