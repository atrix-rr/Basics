import java.util.*;
class Tiles
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one side");
        int Side=sc.nextInt();

        int Area=Side*Side;

        System.out.println("Cost for One sq.M is:");
        int C=sc.nextInt();

        int Cost=Area*C;

        System.out.println("The total cost is:"+Cost);

    }
}