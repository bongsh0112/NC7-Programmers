class Solution {
    public int solution(int[] numbers) {
        boolean[] ten = new boolean[10];
        for (int i : numbers) {
          ten[i] = true;
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
          if (!ten[i]) {
            sum += i;
          }
        }
        return sum;
    }
}