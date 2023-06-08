class Solution {
    public String solution(String myString, int[] indexList) {
        String answer = "";
    String[] str = myString.split("");
    for (int i = 0; i < indexList.length; i++) {
      int n = indexList[i];
      answer += str[n];
    }
  return answer;
    }
}