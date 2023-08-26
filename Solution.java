import java.util.*;
class Solution {
    public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();

            }
        }

         System.out.println(Arrays.toString(transpose(arr)));
    }


    public static int[][] transpose(int[][] ar) {
       
       int a[][]=new int[ar[0].length][ar.length];  
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                    a[j][i]=ar[i][j];
            }
        }
      
      return a;

    }
}
