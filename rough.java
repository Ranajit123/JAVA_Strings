// import java.util.*;

import java.util.Scanner;

public class rough {
  public static String restr(String s){
    
    String ch = s.substring(0, 1);
    String newStr = s.substring(1);
    String str = ch + newStr.replace(ch, "$");

    return str;
  }
  public static void main(String[] args) {
    String str = "AB./*CD";
    for(int i=0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(Character.isWhitespace(ch)){
        System.out.println("Letter present");
      }
    }
  }
}
