class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[100000];
        for (int i = 0; i < strArr.length; i++) {
          answer[strArr[i].length()] += 1;
        }
        int max = 0;
        for (int i = 0; i < answer.length; i++) {
          if (max < answer[i]) {
            max = answer[i];
          }
        }
        return max;
    }
}