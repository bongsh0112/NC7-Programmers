import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>();
        String[] str = s.split("");
        for (String string : str) {
          list.add(string);
        }
        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
          stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}