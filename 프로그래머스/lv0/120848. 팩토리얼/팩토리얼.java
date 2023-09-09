class Solution {
    public int solution(int n) {
        for (int i = 10;i >= 1; i--) {
            if (factorial(i) <= n) {
                return i;
            }
        }
        return 0;
    }
    
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        
        return factorial(n - 1) * n;
    }
}