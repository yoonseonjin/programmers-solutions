class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] array = phone_number.split("");
        
        for (int i = 0; i < array.length - 4; i++) {
            array[i] = "*";
            answer += array[i];
        }
        return answer + phone_number.substring(phone_number.length() - 4);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12948