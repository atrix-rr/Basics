import java.util.*;
class Perimeter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Length");
        int L=sc.nextInt();

        System.out.println("Enter Breadth");
        int B=sc.nextInt();

        double P=2*(L+B);

        System.out.println("The Perimeter is:"+P);

        
    }
}