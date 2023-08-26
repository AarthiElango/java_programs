import java.util.Scanner;
class PrimeNum{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number: ");
 int n=sc.nextInt(); 
 boolean soln=isprime(n);
 System.out.println(soln);
}
 static boolean isprime(int num){

   int i=2;
   while(i*i <= num){
          if(num % i ==0)
              return false;
          i++;
   }
   return true;
}
}
             