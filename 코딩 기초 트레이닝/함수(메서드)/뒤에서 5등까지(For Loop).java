import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] array = new int[5];
        Arrays.sort(num_list);
        
        for (int i = 0; i < 5; i++) {
            array[i] = num_list[i];
        }
        return array;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181853