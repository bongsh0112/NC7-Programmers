class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                if (mode == 0) {
                    mode = 1;
                    continue;
                } else {
                    mode = 0;
                    continue;
                }
            }
            if (mode == 0) {
                if (i % 2 == 0) {
                    if (i == 0) {
                        answer = answer;
                    }
                    answer += String.valueOf(code.charAt(i));
                }
            } else {
                if (i % 2 == 1) {
                    answer += String.valueOf(code.charAt(i));
                }
            }
        }
        
        if (answer.equals("")) {
            return "EMPTY";
        }
        
        return answer;
    }
}