class Solution {
    public String solution(String[] myStrings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < myStrings.length; i++) {
            answer += myStrings[i].substring(parts[i][0], parts[i][1] + 1);
        }
        return answer;
    }
}