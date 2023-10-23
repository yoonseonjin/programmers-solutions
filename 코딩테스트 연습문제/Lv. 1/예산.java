import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

		for (int i : d) {
			sum += i;

			if (budget >= sum) {
				answer++;
			}
		}
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12982