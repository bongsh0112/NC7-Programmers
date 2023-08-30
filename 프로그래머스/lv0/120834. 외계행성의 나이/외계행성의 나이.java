class Solution {
    public String solution(int age) {
        String[] ageString = String.valueOf(age).split("");
        String answer = "";
        for (String s : ageString) {
          int n = Integer.parseInt(s) + 'a';
          char c = (char) n;
          answer += String.valueOf(c);
        }
        return answer;
    }
}