class Solution {
    public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() == 6)) {
            return false;
        }
        try {
            int isNum = Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12918