
/*
 * There are 2 java inbuit function for compare 2 strings->
 * str1.compareTo(str2) -> This function used to treat capital and small latters are not equal
 *                         ex - 'a' != 'A'
 * str1..compareToIgnoreCase(str2) -> This function used to treat capital and small latters are equal
 *                                    ex - 'a' != 'A'
 */
public class largestString {

  public static void main(String[] args) {
    String fruits[] = {"apple", "mango", "banna"};
    String largestStr = fruits[0];
    for(int i=0; i<fruits.length; i++){
      if(largestStr.compareTo(fruits[i])<0){
        largestStr = fruits[i];
      }
    } 
    System.out.println(largestStr);
  }
}