import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] array = new int[5];
        Arrays.sort(num_list);

		System.arraycopy(num_list, 0, array, 0, 5);
        return array;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181853