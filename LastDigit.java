import java.util.*;
class LastDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        int L=n%10;

        System.out.println("Last Digit is:"+L);

    }
}