class Solution {
    public int solution(int[][] arr) {
        boolean b = true;
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!(arr[i][j] == arr[j][i])) {
                    b = false;
                    break;
                }
            }
        }
        if (b) return 1;
        else  return 0;
    }
}