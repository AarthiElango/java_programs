import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
    
    System.out.println("enter n:");
        Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int first=0;
    int second=1;
    System.out.print(" 0 1");
    int count=2;
    int sum=first+second;
    while(count < n)
    {
        int temp=first+second;
        sum=sum+temp ;
        count++; 
        System.out.print(" "+temp+" ");
        first=second ;
        second=temp;
        
    }
    System.out.println("fibonacci sequence of"+ n  +":"+ sum);

    }
    
    
}
