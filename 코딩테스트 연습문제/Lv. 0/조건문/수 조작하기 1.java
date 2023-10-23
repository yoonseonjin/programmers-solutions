class Solution {
    public int solution(int n, String control) {
        String[] strArr = control.split("");

		for (String str : strArr) {
			if (str.equals("w")) {
				n++;
			} else if (str.equals("s")) {
				n--;
			} else if (str.equals("d")) {
				n += 10;
			} else if (str.equals("a")) {
				n -= 10;
			}
		}
        return n;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181926