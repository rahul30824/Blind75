import java.util.*;
class Main
{
public static List<Integer>Solution(int[] array)   
{
List<Integer>list=new ArrayList<>();
 HashSet<Integer>set=new HashSet<>();
 for(int num:array)
 {
     if(!set.contains(num))
     {
         list.add(num);
         set.add(num);
         
     }
 }
 return list;
}
public static void main(String[]args)
{
    int[] array={1,1,1,2,3,4,5};
    System.out.print(Solution(array));
}
}
