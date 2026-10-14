import java.util.Scanner;

public class ShoppingBill {

    // Electronics: 18% GST
    static double calculateElectronicsGST(double a, double b) {
        double amount = a + b;
        return amount + (amount * 18 / 100);
    }

    // Fashion: 13% GST
    static double calculateFashionGST(double c, double d) {
        double amount = c + d;
        return amount + (amount * 13 / 100);
    }

    // Food: 7% GST
    static double calculateFoodGST(double e) {
        return e + (e * 7 / 100);
    }

    // Calculate total bill after GST
    static double totalBill(double a, double b,
                            double c, double d, double e) {
        return calculateElectronicsGST(a, b)
             + calculateFashionGST(c, d)
             + calculateFoodGST(e);
    }

    // Apply 20% discount after GST
    static double calculateDiscountedBill(
            double a, double b, double c, double d, double e) {

        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;

        return total - discount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Electronics item 1 price: ");
        double a = sc.nextDouble();

        System.out.print("Enter Electronics item 2 price: ");
        double b = sc.nextDouble();

        System.out.print("Enter Fashion item 1 price: ");
        double c = sc.nextDouble();

        System.out.print("Enter Fashion item 2 price: ");
        double d = sc.nextDouble();

        System.out.print("Enter Food item price: ");
        double e = sc.nextDouble();

        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);

        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;
        double finalAmount =
                calculateDiscountedBill(a, b, c, d, e);

        System.out.println("\n----- SHOPPING BILL -----");
        System.out.printf("Electronics after GST: Rs. %.2f%n",
                          electronics);
        System.out.printf("Fashion after GST:     Rs. %.2f%n",
                          fashion);
        System.out.printf("Food after GST:         Rs. %.2f%n",
                          food);
        System.out.printf("Total after GST:        Rs. %.2f%n",
                          total);
        System.out.printf("20%% Discount:           Rs. %.2f%n",
                          discount);
        System.out.printf("Final Payable Amount:   Rs. %.2f%n",
                          finalAmount);

        sc.close();
    }
}