import java.util.*;
class Main
{
 public static String Longestuniquesubstring(String string)
 {
HashSet<Character>set=new HashSet<>();
StringBuilder sb = new StringBuilder();
for(char character:string.toCharArray())
{
    if(!set.contains(character))
    {
        sb.append(character);
        set.add(character);
    }
}
return sb.toString();
 }
public static void main(String[] args){
{
 String string="abcaabdeefatefa";
 System.out.print(Longestuniquesubstring(string));
}
}
}
