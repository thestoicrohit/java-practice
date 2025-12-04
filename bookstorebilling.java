import java.util.Scanner;

public class bookstorebilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalMRP = 0, totalDiscount = 0;

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        for (int i = 1; i <= n; i++) {
            System.out.println("Book " + i + ":");

            System.out.print("Enter book name: ");
            String name = sc.nextLine();

            System.out.print("Enter price per book: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter discount %: ");
            double discountPercent = sc.nextDouble();
            sc.nextLine(); // Consume leftover newline

            double bookTotal = price * qty;
            double discountAmount = bookTotal * (discountPercent / 100);

            totalMRP += bookTotal;
            totalDiscount += discountAmount;
        }

        double finalAmount = totalMRP - totalDiscount;

        // Display the results
        System.out.println("\n------------------- BILL SUMMARY -------------------");
        System.out.printf("Total MRP before Discount: ₹%.2f\n", totalMRP);
        System.out.printf("Total Discount: ₹%.2f\n", totalDiscount);
        System.out.printf("Amount Payable after Discount: ₹%.2f\n", finalAmount);
    }
}
