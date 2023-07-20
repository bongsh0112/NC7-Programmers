class Solution {
    public int solution(int[] array) {
        int[] num = new int[1001];
        for (int i = 0; i < array.length; i++) {
          num[array[i]]++;
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < num.length; i++) {
          if (max < num[i]) {
              max = num[i];
              maxIdx = i;
          }
        }
        int count = 0;
        for (int i = 0; i < num.length; i++) {
          if (max == num[i]) count++;
        }
        return count > 1 ? -1 : maxIdx;
    }
}