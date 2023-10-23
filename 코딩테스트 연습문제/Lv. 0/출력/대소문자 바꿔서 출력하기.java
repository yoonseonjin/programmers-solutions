import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            }
        }
        System.out.print(answer);
        sc.close();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181949