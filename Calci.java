

import java.util.Scanner;

class Calci{
public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   char op;

  
   int num1,num2;
System.out.println("Enter the operation (+ - * / % ):");
   op=sc.next().trim().charAt(0);
   System.out.println("Enter num1 and num2: ");
   num1=sc.nextInt();
   num2=sc.nextInt();
   switch(op){
       case '+':System.out.println(num1+num2);
                break;
       case '-':System.out.println(num1-num2);
                break;
       case '*':System.out.println(num1*num2);
                break;
       case '/':System.out.println(num1/num2);
                break;
       case '%':System.out.println(num1%num2);
                break;
       default:System.out.println("enter valid operator: ");
               break;
        }
}
}
       
      