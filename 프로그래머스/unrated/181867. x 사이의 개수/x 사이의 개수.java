import java.util.*;

class Solution {
    public List solution(String myString) {
        String[] strings = myString.split("x", -1);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].length());
        }
        return list;
    }
}