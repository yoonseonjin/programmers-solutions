class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] *= 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181882