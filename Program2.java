import java.util.Scanner;
    public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dynamic input
        System.out.print("Enter Cost Price: ");
        double cost_price = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double selling_price = sc.nextDouble();

        // Calculate profit or loss
        if (selling_price > cost_price) {
            double profit = selling_price - cost_price;
            System.out.println("Profit = " + profit);
        } 
        else if (cost_price > selling_price) {
            double loss = cost_price - selling_price;
            System.out.println("Loss = " + loss);
        } 
        else {
            System.out.println("No Profit, No Loss");
        }

        sc.close();
    }
}

    



    

