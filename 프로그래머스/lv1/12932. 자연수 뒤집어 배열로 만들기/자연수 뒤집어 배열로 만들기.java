import java.util.*;

class Solution {
    public List solution(long n) {
        String[] str = String.valueOf(n).split("");
        List<Long> answer = new ArrayList<>();
        for (int i = str.length - 1; i >= 0; i--) {
          answer.add(Long.parseLong(str[i]));
        }
        return answer;
    }
}