class Solution {
    public int solution(int n) {
        int count = 1;
        while (true) {
            if ((6 * count) % n == 0) {
                break;
            } 
            count++;
        }
        return count;
    }
}