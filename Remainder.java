import java.util.*;
class Remainder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 Numbers");
        int A=sc.nextInt();
        int B=sc.nextInt();

        double R=A%B;

        System.out.println("Ther Remainder is:"+R);
        
    }
}