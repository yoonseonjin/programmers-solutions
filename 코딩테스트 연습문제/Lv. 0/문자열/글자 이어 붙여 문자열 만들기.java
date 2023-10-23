class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

		for (int j : index_list) {
			answer.append(my_string.charAt(j));
		}
        return answer.toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181915