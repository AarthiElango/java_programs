import java.util.*;
class TwoSum{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];        
        for(int i=0;i<n;i++){
              nums[i] = sc.nextInt();
        }
         int target = sc.nextInt();
         int sol[] = twoSum( nums,target);
         System.out.println(Arrays.toString(sol));
    }
    public static int[] twoSum(int[] nums, int targ) {
        for(int i=0;i<nums.length;i++)
        { 
         for(int j=i+1;j<nums.length;j++)
         {
             if(nums[i]+nums[j]==targ)
               return new int[]{i,j};
         }
        }
        return new int[]{};
    }
}