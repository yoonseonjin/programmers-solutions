import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] array = new int[num_list.length - 5];
        int index = 0;
        Arrays.sort(num_list);

        for (int i = 5; i < num_list.length; i++) {
            array[index++] = num_list[i];
        }
        return array;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181852