import java.util.*;

class Solution {
    public int solution(int[] arr) {
        
        boolean b = true;
        int count = 0;
        while (b) {
          int[] temp = arr.clone();
          for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
              arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                  arr[i] = arr[i] * 2 + 1;
                }
              }
              if (Arrays.equals(temp, arr)) {
                b = false;
                  break;
              }
          count++;
        }
        return count;

        }
}