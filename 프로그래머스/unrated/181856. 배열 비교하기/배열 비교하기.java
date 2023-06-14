class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int x = 0;
        int y = 0;
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            x += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            y += arr2[i];
        }
        if (arr1.length < arr2.length || arr1.length == arr2.length && x < y) {
            answer = -1;
        } else if (arr1.length > arr2.length || arr1.length == arr2.length && x > y) {
            answer = 1;
        } else if (arr1.length == arr2.length && x == y) {
            answer = 0;
        } else {
            answer = 2;
        }
        return answer;
    }
}