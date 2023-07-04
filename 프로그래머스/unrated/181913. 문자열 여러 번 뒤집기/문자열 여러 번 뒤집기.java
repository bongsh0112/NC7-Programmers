class Solution {
    public String solution(String myString, int[][] queries) {
        StringBuffer stringBuffer = new StringBuffer();
    String answer = myString;
    for (int i = 0; i < queries.length; i++) {
      stringBuffer.delete(0, stringBuffer.length());
      stringBuffer.append(answer.substring(queries[i][0], queries[i][1] + 1));
      answer = answer.substring(0, queries[i][0]) + stringBuffer.reverse().toString() + answer.substring(queries[i][1] + 1);
    }
    System.out.println("answer = " + answer);
    return answer;
    }
}