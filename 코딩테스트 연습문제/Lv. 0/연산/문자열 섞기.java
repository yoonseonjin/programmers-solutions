class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        String[] array1 = str1.split("");
        String[] array2 = str2.split("");

        for (int i = 0; i < array1.length; i++) {
            answer.append(array1[i]).append(array2[i]);
        }
        return answer.toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181942