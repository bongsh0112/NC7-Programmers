class Solution {
  public static void main(String[] args) {
    new Solution().solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2},{1, 4}});
  }
  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      answer[i] = arr[i];
    }

    for (int i = 0; i < queries.length; i++) { // queries.length : 행의 개수, queries[0].length : 열의 개수
      int a = queries[i][0];
      int b = queries[i][1];

      int temp = answer[a];
      answer[a] = answer[b];
      answer[b] = temp;
    }
    return answer;
  }
}