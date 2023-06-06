class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            index = array[i].equals(" ") ? 0 : index + 1;
            answer += (index % 2 == 0) ? array[i].toLowerCase() : array[i].toUpperCase();
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12930