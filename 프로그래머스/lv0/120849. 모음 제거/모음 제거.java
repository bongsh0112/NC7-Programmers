class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");
        for (int i = 0; i < str.length; i++) {
          if ((!str[i].equals("a")) && (!str[i].equals("e")) && (!str[i].equals("i")) && (!str[i].equals("o")) && (!str[i].equals("u"))) {
            answer = answer + str[i];
          }
        }
        return answer;
    }
}