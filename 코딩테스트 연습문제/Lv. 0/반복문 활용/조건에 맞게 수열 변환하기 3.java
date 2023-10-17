class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int [arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) {
                answer[i] = arr[i] * k;
            }
            if (k % 2 == 0) {
                answer[i] = arr[i] + k;
            }
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181835