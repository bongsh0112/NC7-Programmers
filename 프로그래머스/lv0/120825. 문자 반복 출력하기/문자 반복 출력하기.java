class Solution {
    public String solution(String myString, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = myString.split("");
        for (int i = 0; i < myString.length(); i++) {
          for (int j = 0; j < n; j++) {
            stringBuilder.append(strings[i]);
          }
        }
        return stringBuilder.toString();
    }
}