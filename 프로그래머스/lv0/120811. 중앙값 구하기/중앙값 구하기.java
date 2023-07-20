import java.util.*;

class Solution {
    public int solution(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
          list.add(array[i]);
        }
        Collections.sort(list);
        return list.get(list.size() / 2);
    }
}