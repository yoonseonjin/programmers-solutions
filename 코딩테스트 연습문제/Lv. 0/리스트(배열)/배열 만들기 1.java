class Solution {
    public int[] solution(int n, int k) {
        int length = n / k;
        int[] answer = new int[length];
        
        for (int i = 0, j = 1; j <= length; i++) {
            answer[i] = k * j;
            j++;
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181901