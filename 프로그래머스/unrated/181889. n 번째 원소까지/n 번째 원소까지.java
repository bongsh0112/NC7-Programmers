import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
          arr.add(num_list[i]);
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}