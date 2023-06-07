class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] arr = str.split("");
        int sum = 0;
        
        for (String ss : arr) {
            sum += Integer.parseInt(ss);
        }
        return (x % sum == 0) ? true : false;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12947