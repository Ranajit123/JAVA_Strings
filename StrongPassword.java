public class StrongPassword {
  public static int checkStrongPassword(int n, String password){
    int lc = 0, uc=0, num = 0, sc =0;
    for(int i=0; i<n; i++){
      char ch = password.charAt(i);
      if(Character.isLowerCase(ch)){
        lc++;
      }else if(Character.isUpperCase(ch)){
        uc++;
      }else if(Character.isDigit(ch)){
        num++;
      }else{
        sc++;
      }
    }
    int counter = 0;
    if(lc==0) counter++;
    if(uc==0) counter++;
    if(num==0) counter++;
    if(sc==0) counter++;

    int requiredChar;
    if(n>=6 && lc>0 && uc>0 && num>0 && sc>0){
      requiredChar = 0;
    }else if(n>=6){
      requiredChar = counter;
    }else if(n<6 && lc>0 && uc>0 && num>0 && sc>0){
      requiredChar = 6-n;
    }else{
      int target = n+counter;
      if(target>6){
        requiredChar = counter;
      }else{
        requiredChar = 6-n;
      }
    }
    return requiredChar;

  }
  public static void main(String[] args) {
    String str = "Ab1";
    int n = str.length();
    System.out.println(checkStrongPassword(n, str));
  }
}
