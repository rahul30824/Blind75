import java.util.*;
class Main
{
 public static int Solution(String s)   
 {
     int left=0;
     int max=0;
     HashSet<Character>set=new HashSet<>();
     for(int right=0;right<s.length();right++)
     {
         char ch=s.charAt(right);
         while(set.contains(ch))
         {
             set.remove(s.charAt(left));
             left++;
         }
         set.add(ch);
         max=Math.max(max,right-left+1);
        
     }
      return max;
 }
public static void main(String[]args)
{
    String s="pwwkew";
    System.out.print(Solution(s));
    
}
}
