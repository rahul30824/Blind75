import java.util.*;
class Main
{
public static int Solution(int[] arr)
{
    int min=arr[0];
    int profit=0;
    int cost=0;
   for(int i=0;i<arr.length;i++) 
   {
       cost=arr[i]-min;
       profit=Math.max(cost,profit);
       min=Math.min(min,arr[i]);
         }
   return profit;
}
public static void main(String[] args)
{
 int[] arr={1,3,5,6,9};
 System.out.print(Solution(arr));
}
}
