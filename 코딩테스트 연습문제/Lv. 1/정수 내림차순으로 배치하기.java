import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] strArr = str.split("");
        Arrays.sort(strArr, Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();

		for (String s : strArr) {
			answer.append(s);
		}
        return Long.parseLong(answer.toString());
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12933