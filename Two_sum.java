import java.util.*;
class Main
{
public static int[] Twosum(int[]nums,int target)
{
    int sum=0;
    int i=0;
    int j=0;
   for( i=0;i<nums.length;i++) 
   {
      for( j=i+1;j<nums.length;j++) 
      {
          sum=nums[i]+nums[j];
          if(sum==target)
          {
              return new int[]{i,j};
          }
      }
   }
  return new int[]{i,j};
}
public static void main(String[] args)
{
   int[] nums={1,2,3,4,5};
   int target=9;
   System.out.print(Arrays.toString(Twosum(nums,target)));
}
}
