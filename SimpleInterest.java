import java.util.*;
class SimpleInterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Values");
        int P=sc.nextInt();
        double R=sc.nextDouble();
        int T=sc.nextInt();

        double SI=(P*R*T)/100;

        {
            System.out.println("The SI is:"+SI);
        }
    }
}