/*
*For a given String convert each of the 1st letter of each word to uppercase
*/
public class convert1stLetterTouppercase {

  public static String convertToUppercase(String str){
    StringBuilder newStr = new StringBuilder();
    newStr.append(Character.toUpperCase(str.charAt(0)));
    for(int i=1; i<str.length(); i++){
      if(str.charAt(i) == ' ' && i<str.length()-1){
        newStr.append(str.charAt(i));
        i++;
        newStr.append(Character.toUpperCase(str.charAt(i)));
      }else{
        newStr.append(str.charAt(i));
      }
    }
    return newStr.toString();
  }
  public static void main(String[] args) {
    String str = "hello moto";
    System.out.println(convertToUppercase(str));
  }
}