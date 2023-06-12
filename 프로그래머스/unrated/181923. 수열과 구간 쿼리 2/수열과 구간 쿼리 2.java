import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int size = queries.length;
    int[] answer = new int[size];
    for (int i = 0; i < size; i++) {
      int s = queries[i][0];
      int e = queries[i][1];
      int k = queries[i][2];
      List<Integer> temp = new ArrayList<>();
      for (int j = s; j < e + 1; j++) {
        if (k < arr[j]) {
          temp.add(arr[j]);
          continue;
        }
      }
      if (temp.isEmpty()) temp.add(-1);
      answer[i] = Collections.min(temp);
    }
    return answer;
    }
}