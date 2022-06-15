import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int num = 12345678;
        System.out.printf(Locale.US, "%,d", num);
    }
}
