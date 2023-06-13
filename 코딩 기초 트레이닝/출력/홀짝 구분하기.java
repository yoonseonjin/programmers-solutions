import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print((n % 2 == 0) ? (n + " is even") : (n + " is odd"));
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181944