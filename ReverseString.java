public class ReverseString {

  public static String reverseStr(String str){
    StringBuilder newStr = new StringBuilder();
    for(int i = str.length()-1; i>=0; i--){
      newStr.append(str.charAt(i));
    }
    return newStr.toString();
  }
  public static void main(String[] args) {
    String str = "Ranajit";
    System.out.println(reverseStr(str));
  }
}