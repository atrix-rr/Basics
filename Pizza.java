import java.util.Scanner;

class Pizza
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the pizza: ");
        double price = sc.nextDouble();

        double tax = price * 0.10;
        double finalPrice = price + tax;

        System.out.println("Tax (10%): " + tax);
        System.out.println("Final Price: " + finalPrice);

        sc.close();
    }
}