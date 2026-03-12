import java.util.*;
class Currency
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Rupees");
        int r=sc.nextInt();

        double Dollars=r/92.30;

        System.out.println("Dollars is:"+Dollars);
    }
}