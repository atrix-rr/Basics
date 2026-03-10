import java.util.*;
class Gatekeeper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Secret No.");
        int S=sc.nextInt();

        if(S==123)
        {
            System.out.println("Access Granted");
        }
        else
        {
            System.out.println("Security Breach💀💀😈");
        }
    }
}