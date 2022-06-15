import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println(" Vvedi chislo : ");
        int num1 = num.nextInt();
        System.out.printf(Locale.US, "%,d", num1);
    }
}
