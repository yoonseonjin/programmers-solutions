class Solution {
    public int solution(int[] num_list, int n) {
		for (int i : num_list) {
			if (i == n) {
				return 1;
			}
		}
        return 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181840