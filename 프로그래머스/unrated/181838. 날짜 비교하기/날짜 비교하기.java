class Solution {
    public int solution(int[] date1, int[] date2) {
        String d1 = "";
        String d2 = "";
        for (int i = 0; i < date1.length; i++) {
            d1 += String.valueOf(date1[i]);
            d2 += String.valueOf(date2[i]);
        }
        if (Integer.parseInt(d1) - Integer.parseInt(d2) < 0) {
            return 1;
        }
        return 0;
    }
}