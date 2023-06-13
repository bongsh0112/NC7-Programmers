import java.util.*;

class Solution {
    public int[] solution(int[] numList) {
         List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numList.length; i++) {
          list.add(numList[i]);
        }
        Collections.sort(list);
        list = list.subList(0, 5);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}