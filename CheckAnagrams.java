/*
 * If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a care,or care's characters can be formed into race
 */
import java.util.*;
public class CheckAnagrams {
  public static boolean checkAnagramsStr(String str1, String str2){
    boolean flag = false ;
    if(str1.length() != str2.length()){
      return false;
    }

    // convert to lower case to avoid upper case check 
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // convert to array
    char str1CharArr[] = str1.toCharArray();
    char str2charArr[] = str2.toCharArray();

    // sort the arrays
    Arrays.sort(str1CharArr);
    Arrays.sort(str2charArr);

    flag = Arrays.equals(str1CharArr, str2charArr);
    return flag;
  }
  public static void main(String[] args) {
    String str1 = "race";
    String str2 = "care";
    System.out.println(checkAnagramsStr(str1, str2));
  }
}
