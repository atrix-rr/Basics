import java.util.*;
class Remainder1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int R=a%b;

        System.out.println("The Resulty is:"+R);
    }
}