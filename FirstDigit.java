import java.util.*;
class FirstDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number");
        int num=sc.nextInt();

        int F=num/100;

        System.out.println("The First Digit is:"+F);
    }
}