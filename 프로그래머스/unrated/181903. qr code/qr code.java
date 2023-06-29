class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < code.length(); i++) {
          if (i % q == r) {
            stringBuffer.append(code.charAt(i));
          }
        }
        return stringBuffer.toString();
    }
}