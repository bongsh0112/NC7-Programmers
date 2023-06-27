package src;

import java.util.List;

public class Programmers {
  
  static int americano = 4500;
  static int cafelatte = 5000;
  
  public static void main(String[] args) {
  
  }
  
  public int solution(String[] order) {
    int totalPrice = 0;
    int length = order.length;
    for (int i = 0; i < length; i++) {
      if (order[i].contains("americano") || order[i].equals("anything")) {
        totalPrice += americano;
      }
      if (order[i].contains("cafelatte")) {
        totalPrice += cafelatte;
      }
    }
    return totalPrice;
  }
  
}
