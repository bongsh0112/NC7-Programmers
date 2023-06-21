import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(String[] strList) {
        List<String> answer = new ArrayList<>();
    int idx = -1;
    for (int i = 0; i < strList.length; i++) {
      if (strList[i].equals("l")) {
        for (int j = 0; j < i; j++) {
          idx = i;
          answer.add(strList[j]);
        }
        break;
      } else if (strList[i].equals("r")) {
        idx = i;
        for (int j = i + 1; j < strList.length; j++) {
          answer.add(strList[j]);
        }
        break;
      }
    }
    return answer;
    }
}