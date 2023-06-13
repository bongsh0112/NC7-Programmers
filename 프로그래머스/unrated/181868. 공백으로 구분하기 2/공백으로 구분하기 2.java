import java.util.*;

class Solution {
    public static List solution(String myString) {
    List<String> answer = new ArrayList<>();
    String[] str = myString.split(" ");
    for (int i = 0; i < str.length; i++) {
      if (!str[i].equals(" ") && !str[i].equals("")) {
        answer.add(str[i]);
      }
    }
    return answer;
  }
}