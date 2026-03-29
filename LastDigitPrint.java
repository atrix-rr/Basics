import java.util.*;
class LastDigitPrint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number");
        int num=sc.nextInt();

        int L=num%10;

        System.out.println("The Last Digit is:"+L);


    }
}