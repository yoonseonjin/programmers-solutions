import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] strArr = a.split("");
		for (String str : strArr) {
			System.out.println(str);
		}
        sc.close();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181945