class Main
{
public static int Solution(int[] nums)    {
    int currentsum=nums[0];
    int maxsum=nums[0];
    for(int i=0;i<nums.length;i++)
    {
        currentsum=Math.max(nums[i],currentsum+nums[i]);
        maxsum=Math.max(currentsum,maxsum);
    }
    return maxsum;
    
}
public static void main(String[] args)
{
 int[] nums={-5, -2, 1, 2, -100, 3, 4};
 System.out.print(Solution(nums));
}
}
