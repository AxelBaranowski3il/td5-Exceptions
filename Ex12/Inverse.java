package Ex12;

public class Inverse {
  public static double calculInverse(int x){
    try {
      return 1 / x; 
    } catch(ArithmeticException e){
      return 0;
    }
  }
}