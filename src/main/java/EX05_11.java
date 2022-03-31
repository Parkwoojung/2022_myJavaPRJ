import java.util.Scanner;

public class EX05_11 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.printf("정수를 입력하세요 \n");

        int a = 10;
        if (a % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
//적용하는 코드의 범위가 큰 코드일 수록 위쪽에 있어야함 => 정상적으로 코드 실행 가능함