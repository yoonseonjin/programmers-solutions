class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        
        return myString.contains(pat) ? 1 : 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181878