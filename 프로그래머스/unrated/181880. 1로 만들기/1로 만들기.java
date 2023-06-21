class Solution {
    public int solution(int[] numList) {
        int answer = 0;
        for (int i = 0; i < numList.length; i++) {
            int n = numList[i];
            while (n > 1) {
                n /= 2;
                answer++;
            }
        }
        return answer;
    }
}