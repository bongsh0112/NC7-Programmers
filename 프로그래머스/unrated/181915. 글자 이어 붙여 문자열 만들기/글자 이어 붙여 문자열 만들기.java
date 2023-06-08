class Solution {
    public String solution(String myString, int[] indexList) {
        String answer = "";
    String[] str = myString.split("");
    for (int index : indexList) {
      answer += str[index];
    }
  return answer;
    }
}