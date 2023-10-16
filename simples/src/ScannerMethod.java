import java.util.Scanner;
public class ScannerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();
        System.out.println("hello " + firstName + " " + lastName);
    }
}
