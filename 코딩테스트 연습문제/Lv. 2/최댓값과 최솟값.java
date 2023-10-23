class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

		for (String str : strArray) {
			int number = Integer.parseInt(str);
			min = Math.min(min, number);
			max = Math.max(max, number);
		}
        answer = min + " " + max;
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12939