class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int length = num_list.length;
        
        for (int i = 0; i < length; i++) {
            answer = addToArray(answer, num_list[i]);
        }

        if (num_list[length - 1] > num_list[length - 2]) {
            answer = addToArray(answer, num_list[length - 1] - num_list[length - 2]);
        } else {
            answer = addToArray(answer, num_list[length - 1] * 2);
        }
        return answer;
    }
    
    public int[] addToArray(int[] num_list, int n) {
        int[] arr = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            arr[i] = num_list[i];
        }
        arr[arr.length - 1] = n;
        return arr;
    }
}