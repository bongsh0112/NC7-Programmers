
import java.util.*;
class Solution {
    public int[] solution(int[] numList, int n) {
        List<Integer> arr = new ArrayList<>();
    for (int i = 0 ; i < numList.length; i = i + n) {
      arr.add(numList[i]);
    }
    int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
    return answer;
    }
}