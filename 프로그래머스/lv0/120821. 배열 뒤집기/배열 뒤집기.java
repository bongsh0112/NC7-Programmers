import java.util.*;

class Solution {
    public int[] solution(int[] numList) {
        List<Integer> list = new ArrayList<>();
    for (int i = numList.length - 1; i >= 0; i--) {
      list.add(numList[i]);
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}