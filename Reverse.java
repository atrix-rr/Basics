import java.util.Scanner;

class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        int num = sc.nextInt();

        int d1 = num % 10;
        int d2 = (num / 10) % 10;
        int d3 = num / 100;

        int rev = d1*100 + d2*10 + d3;

        System.out.println("Reverse = " + rev);
    }
}