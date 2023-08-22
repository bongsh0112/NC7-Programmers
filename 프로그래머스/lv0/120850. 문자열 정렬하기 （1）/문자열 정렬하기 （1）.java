import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] str = myString.replaceAll("[a-z]", "").split("");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
          arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        return arr;
    }
}