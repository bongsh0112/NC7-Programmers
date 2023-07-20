class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int temp = gcd(numer, denom);
        numer /= temp;
        denom /= temp;
        return new int[]{numer, denom};
      }

      public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
      }
}