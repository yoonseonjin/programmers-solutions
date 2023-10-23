import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int index = 0;
        int number = 0;

		for (int i : arr) {
			if (i % divisor == 0) {
				index++;
			}
		}

        if (index == 0) {
			return new int[] {-1};
        }

        int[] answer = new int[index];

		for (int j : arr) {
			if (j % divisor == 0) {
				answer[number] = j;
				number++;
			}
		}
        Arrays.sort(answer);
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12910