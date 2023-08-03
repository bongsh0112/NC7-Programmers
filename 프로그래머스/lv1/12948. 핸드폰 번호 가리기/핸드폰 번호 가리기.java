class Solution {
    public String solution(String phoneNumber) {
        int len = phoneNumber.length();
        String s = phoneNumber.substring(len - 4);
        String star = "*".repeat(len - 4);
        return star.concat(s);
    }
}