public class subString {

  public static String getSubString(String str , int si, int ei){
    String Substr = "";
    for(int i = si; i<ei; i++){
      Substr += str.charAt(i);
    }
    return Substr;
  }
  public static void main(String[] args) {
    String str = "helloworld";
    // get sub String using user function
    System.out.println(getSubString(str, 4, 5));

    // get sub String using java inbuilt function
    System.out.println(str.substring(4, 5)); 
    
  }
}