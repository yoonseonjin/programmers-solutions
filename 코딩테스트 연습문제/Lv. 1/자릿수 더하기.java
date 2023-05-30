class Solution {
    public int solution(int n) {
		int answer = 0;
		String str = String.valueOf(n);
        
		for (int i = 0; i < str.length(); i++) {
			answer += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12931