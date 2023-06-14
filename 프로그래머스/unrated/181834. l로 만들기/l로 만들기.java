class Solution {
    public static String solution(String myString) {
    // l = 108
    String answer = "";
    for (int i = 0; i < myString.length(); i++) {
      if ((int) myString.charAt(i) < 108) {
        answer += "l";
      } else {
        answer += String.valueOf(myString.charAt(i));
      }
    }
    return answer;
  }
}