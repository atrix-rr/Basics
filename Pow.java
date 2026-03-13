import java.util.*;
class Pow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int num=sc.nextInt();

        double P=Math.pow(num,num);

        System.out.println("The power is:"+P);
    }
}