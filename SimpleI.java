import java.util.*;
class SimpleI
{
    public static void main(String args[])
    {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        double P=sc.nextDouble();

        System.out.println("Enter the Full term");
        int T=sc.nextInt();

        System.out.println("Enter Rate of Interest");
        double R=sc.nextDouble();

        double SI=(P*R*T)/100;

        System.out.println("The SI is:"+SI);
    }
}