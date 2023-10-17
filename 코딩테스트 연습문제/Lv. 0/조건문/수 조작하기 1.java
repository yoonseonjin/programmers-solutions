class Solution {
    public int solution(int n, String control) {
        String[] array = control.split("");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("w")) {
                n++;
            }
            if (array[i].equals("s")) {
                n--;
            }
            if (array[i].equals("d")) {
                n += 10;
            }
            if (array[i].equals("a")) {
                n -= 10;
            }
        }
        return n;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181926