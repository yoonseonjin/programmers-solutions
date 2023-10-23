class Solution {
    public int solution(int a, int b) {
        String strAb = String.valueOf(a) + String.valueOf(b);
        String strBa = String.valueOf(b) + String.valueOf(a);
        int ab = Integer.parseInt(strAb);
        int ba = Integer.parseInt(strBa);
        return Math.max(ab, ba);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181939