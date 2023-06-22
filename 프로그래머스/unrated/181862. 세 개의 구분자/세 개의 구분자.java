import java.util.List;
import java.util.ArrayList;

class Solution {
    public static List solution(String myStr) {
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < myStr.length(); i++) {
      if (myStr.charAt(i) != 'a' && myStr.charAt(i) != 'b' && myStr.charAt(i) != 'c') {
        stringBuffer.append(String.valueOf(myStr.charAt(i)));
      } else if (myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c') {
        stringBuffer.append(",");
      }
    }
    List<String> list = new ArrayList<>();
    String[] str = stringBuffer.toString().split(",");
    for (int i = 0; i < str.length; i++) {
      if (!str[i].isBlank()) {
        list.add(str[i]);
      }
    }
    if (list.isEmpty()) {
      list.add("EMPTY");
    }
    return list;
  }
}