import java.text.DecimalFormat;
public class RentalYield {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(calculatePropertyYield(1300, 250_000)) + "%");
    }

    private static double calculatePropertyYield(double rent, double propertyPrice) {
        return ((rent * 12) /propertyPrice) * 100;
    }
}
