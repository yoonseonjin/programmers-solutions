class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "C");
        myString = myString.replace("B", "A");
        myString = myString.replace("C", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181864