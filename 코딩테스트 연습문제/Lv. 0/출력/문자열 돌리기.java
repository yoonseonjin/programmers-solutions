import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] array = a.split("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181945