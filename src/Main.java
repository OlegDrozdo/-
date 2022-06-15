import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = 12345678;
        System.out.printf(Locale.US, "%,d", num1);
    }
}
