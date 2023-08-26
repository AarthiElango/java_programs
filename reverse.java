import java.util.Scanner;

public class reverse {
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
     int n;
     System.out.println("enter the number:");
     n=sc.nextInt();
     int soln=rev(n);
     System.out.println(soln);
    }
    static int rev(int n)
    { 
int val=0;
       while(n>0)
       {
        int rem=n%10;
        val=val*10+rem;

        n=n/10;
       

       }
       return val;
    }
}
