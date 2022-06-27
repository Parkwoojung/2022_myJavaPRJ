package STUDY;

import java.util.Scanner;

public class Java_0627_1 {
    public static void main(String[] args) {

        System.out.print("숫자를 입력해보세용: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Java_0627_1 J = new Java_0627_1();
        J.solution(n);
    }

    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer += "Even";

        } else {
            answer += "Odd";

        }
        System.out.println(answer);
        return answer;
    }
}