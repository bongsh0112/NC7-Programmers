class Solution {
    public long solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
          stringBuilder.append(n % 3);
          n = n / 3;
        }
        String[] num = stringBuilder.toString().split("");
        int answer = 0;
        for (int i = 0; i < num.length; i++) {
          answer += Integer.parseInt(num[i]) * Math.pow(3, num.length - i - 1);
        }
        return answer;
    }
}