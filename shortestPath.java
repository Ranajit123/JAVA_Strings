/*
 * Find Shortest path
 * Main logic 
 * W -> x = -1
 * N -> y = +1
 * E -> x = +1
 * s -> y = -1
 * 
 * Formula for shortest path is root over((x2-x1)^2 + (y2-y1)^2)
 */

public class shortestPath {
  public static float findShortestPath(String str){
    int x = 0, y = 0;
    for(int i =0; i<str.length(); i++){
      // West
      if(str.charAt(i)=='w' || str.charAt(i)=='W'){
        x--;
      }
      // North
      else if(str.charAt(i)=='n' || str.charAt(i)=='N'){
        y++;
      }
      // East 
      else if(str.charAt(i)=='e' || str.charAt(i)=='E'){
        x++;
      }
      // South
      else if(str.charAt(i)=='s' || str.charAt(i)=='S'){
        y--;
      }
    }

    return (float)Math.sqrt(x*x + y*y);
  }
   public static void main(String[] args) {
    String str = "nswe";
    System.out.println(findShortestPath(str));
   }
}