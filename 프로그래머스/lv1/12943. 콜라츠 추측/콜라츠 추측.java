class Solution {
    public int solution(long num) {
        if (num == 1) return 0;
        
        int count = 0;
        while (true) {
            if (num == 1) break;
            num = num % 2 == 0 ? num = num / 2 : num * 3 + 1;
            count++;
        }
        
        if (count >= 500) {
            return -1;
        }
        return count;
    }
}