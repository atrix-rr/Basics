import java.util.*;
class Greatest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 Numbers");
        double a=sc.nextDouble();
        double b=sc.nextDouble();

        double g=Math.max(a,b);
        
        System.out.println("The Greater is:"+g);
    }
}