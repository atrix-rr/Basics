import java.util.*;
class Electricity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the total units");
        int U=sc.nextInt();

        int bill=U*5;

        System.out.println("The Bill is:"+bill);
    }
}