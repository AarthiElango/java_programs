import java.util.*;
class Largest{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.println("enter value of a,b,c:");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       int soln=larg(a,b,c);
       System.out.println(soln);
         
        
    }
    static int larg(int a,int b,int c)
    {   
       /*int max=0;
        if(a>b)
           max=a;
        max=b;
        if(max<c)
           max=c;
        return max;

 */
     int maxi=Math.max(c,Math.max(a,b));

     return maxi;
    }
}