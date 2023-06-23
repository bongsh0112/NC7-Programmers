class Solution {
    public static String solution(String myString, int s, int e) {
        StringBuffer stringBuffer = new StringBuffer(myString.substring(s, e + 1));
        return myString.substring(0, s) + stringBuffer.reverse().toString()
                + myString.substring(e + 1, myString.length());
    }
}