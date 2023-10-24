class Solution {
    public int solution(int[] num_list) {
        int answer = (11 <= num_list.length) ? 0 : 1;

		for (int i : num_list) {
			if (11 <= num_list.length) {
				answer += i;
			}
			if (num_list.length <= 10) {
				answer *= i;
			}
		}
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181879