class Solution {
    public int solution(String num_str) {
        String[] arr = num_str.split("");
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
        }

        int answer = 0;

		for (int j : newArr) {
			answer += j;
		}
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181849