class Solution {
    public String solution(String[] strList, String ex) {
        String answer = "";
        for (int i = 0; i < strList.length; i++) {
          if (!strList[i].contains(ex)) {
            answer += strList[i];
          }
        }
        return answer;
    }
}