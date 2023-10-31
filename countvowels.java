/*
 * Count how many times lowercase vowels occurred in a String entered by the user
 */
import java.util.*;
public class countvowels {
  public static int lowercasevowels(String str){
    int count = 0;
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        count ++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your String: ");
    String str = sc.nextLine();
    System.out.println("Number of vowels in the given String is "+lowercasevowels(str));
    sc.close();
  }
}
