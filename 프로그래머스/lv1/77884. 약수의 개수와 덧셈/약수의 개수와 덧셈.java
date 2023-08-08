class Solution {
    public static int solution(int left, int right) {
    int answer = 0;
    for (int i = left; i <= right; i++) {
      if (isEvenOdd(i)) {
        answer += i;
      } else {
        answer -= i;
      }
    }
    return answer;
  }
  
  public static boolean isEvenOdd(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    return count % 2 == 0;
  }
}