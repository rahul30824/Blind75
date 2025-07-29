import java.util.*;
class Main
{
public static List<List<Integer>>Solution(int[]nums)    
{
Set<List<Integer>> result = new HashSet<>();

  
  for(int i=0;i<nums.length-1;i++)
  {
     HashSet<Integer>set=new HashSet<>();
    for(int j=i+1;j<nums.length-1;j++)
    {
        int k=-(nums[i]+nums[j]);
       if (set.contains(k)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
        set.add(nums[j]);
    }
  }
  return new ArrayList<>(result);
}
public static void main(String[] args)
{
  int[] nums={-1,0,1,2,-1,-4};
  System.out.print(Solution(nums));
}
}
