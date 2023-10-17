class Solution {
    public int solution(int[] num_list) {
        int index = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] >= 0) {
                index++;
            }
            if (num_list[i] < 0) {
                break;
            }
        }
        return index == num_list.length ? -1 : index;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181896