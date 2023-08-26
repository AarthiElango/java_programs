import java.util.Scanner;
public class charOccurrence {
    public static void main(String[] args)
    {
     Scanner sc =new Scanner(System.in);
     int n,val;
     System.out.println("enter the number:");
     n=sc.nextInt();
      System.out.println("enter the value for occurrence:");
      val=sc.nextInt();
      int sol=count(n,val);
       System.out.println(sol);
    }
    static int count(int n,int val)
    { int cnt=0;
        while(n>0)

        {
            int rem=n%10;
            if(rem== val)
              cnt++;
            n=n/10;

        }
        return cnt;
    }
}
