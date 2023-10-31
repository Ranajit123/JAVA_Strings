public class removeSpace {
  public static String spaceRemovedStr(String str){
    
    // Using extra space
    
    // StringBuilder newStr = new StringBuilder();
    // for(int i=0; i<str.length(); i++){
    //   if(str.charAt(i) == ' '){
    //     continue;
    //   }
    //   newStr.append(str.charAt(i));
    // }
    // return newStr.toString();

    // with out using extra space
    str = str.replaceAll(" ","");
    return str;
  }
  public static void main(String[] args) {
    String str = "aa          ab          abc              ab";
    System.out.println(spaceRemovedStr(str));
    // spaceRemovedStr(str);
  }
}
