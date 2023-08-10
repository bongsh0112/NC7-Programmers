class Solution {
    public static int[] solution(int n, int m) {
        int x = Math.max(n, m);
        int y = Math.min(n, m);
        int[] answer = new int[]{gcd(x, y), lcm(x, y)};
        return answer;
      }

      public static int gcd(int n, int m) {
        int r = 0;
        while (m != 0) {
          r = n % m;
          n = m;
          m = r;
        }
        return n;
      }

      public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
      }
}