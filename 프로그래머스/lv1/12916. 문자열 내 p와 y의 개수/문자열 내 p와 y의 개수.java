class Solution {
    boolean solution(String s) {
        String[] str = s.toLowerCase().split("");
        int p = 0;
        int y = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("p")) {
                p++;
            } else if (str[i].equals("y")) {
                y++;
            }
        }
        return p == y ? true : false;
    }
}