import java.util.*;
class Cube
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number");
        int num=sc.nextInt();

        double P=Math.pow(num,3);

        System.out.println("The Result is:"+P);
    }
}