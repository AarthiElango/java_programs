import java.util.Scanner;
class armstrong{
public static void main(string[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int cnt=count(n);
      int sol=arms(n);
      System.out.println(sol);
}
 static int count(int num){
      int ct;  
      while(num >0){
        int rem=num % 10;
        ct++;
        num=num/10;
        }
      

 
   

