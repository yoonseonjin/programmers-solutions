class Solution {
    boolean solution(String s) {
        String[] arr = s.toUpperCase().split("");
        int p = 0;
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            if ("P".equals(arr[i])) {
                p++;
            }
            if ("Y".equals(arr[i])) {
                y++;
            }
        }
        return (p == y) ? true : false;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12916