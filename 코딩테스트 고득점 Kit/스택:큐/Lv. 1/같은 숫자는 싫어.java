import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int preNumber = -1;

		for (int i : arr) {
			if (preNumber != i) {
				preNumber = i;
				list.add(i);
			}
		}

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12906