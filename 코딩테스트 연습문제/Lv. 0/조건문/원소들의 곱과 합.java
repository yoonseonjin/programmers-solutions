class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;
        int square = 0;

		for (int i : num_list) {
			product *= i;
			sum += i;
		}
        square = sum * sum;
        return (product < square) ? 1 : 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181929