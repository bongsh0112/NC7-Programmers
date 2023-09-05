class Solution {
    public int solution(int num, int k) {
         String n = String.valueOf(num);
        String t = String.valueOf(k);
        return n.indexOf(t) == -1 ? -1 : n.indexOf(t) + 1;
    }
}