class Solution {
    public int solution(int[] num_list) {
        int answer = (num_list.length >= 11) ? 0 : 1;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                answer += num_list[i];
            }
            if (num_list.length <= 10) {
                answer *= num_list[i];
            }
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181879