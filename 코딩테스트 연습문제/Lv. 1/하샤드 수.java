class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] strArr = str.split("");
        int sum = 0;

        for (String s : strArr) {
            sum += Integer.parseInt(s);
        }
        return x % sum == 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12947