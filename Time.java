import java.util.*;
class Time
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the time in Minutes");
        int M=sc.nextInt();

        double H=M/60;

        System.out.println("The time in Hours is:"+H);
    }
}