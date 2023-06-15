import java.util.*;

class Solution {
    public List solution(String myString) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < myString.length(); i++) {
          list.add(myString.substring(i));
        }
        Collections.sort(list);
        return list;
    }
}