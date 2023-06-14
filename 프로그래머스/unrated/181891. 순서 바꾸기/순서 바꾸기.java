import java.util.*;

class Solution {
    public static List solution(int[] numList, int n) {
    List<Integer> list = new ArrayList<>();
    for (int i = n; i < numList.length; i++) {
      list.add(numList[i]);
    }
    for (int i = 0; i < n; i++) {
      list.add(numList[i]);
    }
    return list;
  }
}