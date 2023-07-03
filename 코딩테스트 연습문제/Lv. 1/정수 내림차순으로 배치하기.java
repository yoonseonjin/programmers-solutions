import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] strArr = str.split("");
        Arrays.sort(strArr, Collections.reverseOrder());   
        
        String answer = "";
        
        for (int i = 0; i < strArr.length; i++) {
            answer += strArr[i];
        }
        return Long.parseLong(answer);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12933