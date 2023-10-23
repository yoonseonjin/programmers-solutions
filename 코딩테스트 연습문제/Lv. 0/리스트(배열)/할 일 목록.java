import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> strList = new ArrayList<String>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                strList.add(todo_list[i]);
            }
        }
        return strList.toArray(new String[0]);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181885