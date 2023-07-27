class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int X = x;
        while (x > 0) {
          sum += x % 10;
          x /= 10;
        }
        if (X % sum == 0) {
          return true;
        } else {
          return false;
        }
    }
}