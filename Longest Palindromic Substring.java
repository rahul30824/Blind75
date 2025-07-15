import java.util.*;
class Main
{
public static int PalindromicSubstring(String str)   
{
    String sub=" ";
    int Max=Integer.MIN_VALUE;
    int count=0;
    for(int i=0;i<str.length();i++){
    for(int j=i+1;j<=str.length();j++){
        sub=str.substring(i,j);
        if(palindrome(sub))
        {
            Max=Math.max(Max,sub.length());
        }
        }
    }
    return Max;
}
public static boolean palindrome(String str)
{
 int start=0;
 int end=str.length()-1;
 while(start<=end)
 {
     if(str.charAt(start)!=str.charAt(end))
     {
         return false;
     }
     start++;
     end--;
 }
 return true;
}
public static void main(String[] args)
{
String str="ababa";
System.out.print(PalindromicSubstring(str));
}
}
