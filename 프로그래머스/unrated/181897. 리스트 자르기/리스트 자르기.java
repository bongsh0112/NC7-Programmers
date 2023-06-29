import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static int[] answer;
      public static int[] solution(int n, int[] slicer, int[] numList) {
        switch (n) {
          case 1:
            answer = Arrays.copyOfRange(numList, 0, slicer[1] + 1);
            return answer;
          case 2:
            answer = Arrays.copyOfRange(numList, slicer[0], numList.length);
            return answer;
          case 3:
            answer = Arrays.copyOfRange(numList, slicer[0], slicer[1] + 1);
            return answer;
          case 4:
            List<Integer> list = new ArrayList<>();
            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
              list.add(numList[i]);
            }
            return answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
      }
}