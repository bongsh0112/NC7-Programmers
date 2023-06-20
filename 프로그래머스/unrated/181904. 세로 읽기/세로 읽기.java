import java.util.*;

class Solution {
    public static String solution(String myString, int col, int targetCol) {
    int start = 0;
    int end = col;
    String answer = "";
    for (int i = 0; i < myString.length()/col; i++) {
      String slicedWords = myString.substring(start, end);
      answer += String.valueOf(slicedWords.charAt(targetCol - 1));
      start = end;
      end += col;
    }
    return answer;
  }
}