class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");
        return myString;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181874