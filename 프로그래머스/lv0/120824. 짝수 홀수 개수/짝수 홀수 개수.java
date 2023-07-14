class Solution {
    public int[] solution(int[] numList) {
        int[] answer = new int[2];
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}