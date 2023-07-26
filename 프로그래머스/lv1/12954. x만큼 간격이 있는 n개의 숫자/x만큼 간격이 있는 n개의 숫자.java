import java.util.*;

class Solution {
    public List solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            answer.add((long) x * (long) i);
        }
        return answer;
    }
}