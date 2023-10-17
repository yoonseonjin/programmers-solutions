class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String[] array1 = str1.split("");
        String[] array2 = str2.split("");
        
        for (int i = 0; i < array1.length; i++) {
            answer += array1[i] + array2[i];
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181942