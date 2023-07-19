import java.util.*;

class Solution {
    public List solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
    
        for (int i = 0; i < picture.length; i++) {
          String[] str = picture[i].split("");
          String temp = "";
          for (int j = 0; j < str.length; j++) {
            temp += str[j].repeat(k);
          }
          for (int j = 0; j < k; j++) {
            answer.add(temp);
          }
        }
        return answer;
    }
}