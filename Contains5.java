import java.util.*;
class Contains5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num=sc.nextInt();

        int H=num/100;
        int T=(num/10)%10;
        int O=num%10;

        if(H==5||T==5||O==5)
        {
            System.out.println("Contains 5");
        }
        else
        {
            System.out.println("Not ");
        }
    }
}