import java.util.Scanner;

class GreatestThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int g = Math.max(a, Math.max(b, c));

        System.out.println("Greatest = " + g);
    }
}