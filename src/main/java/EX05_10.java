import java.util.Scanner;

public class EX05_10 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int a;

        System.out.printf("정수를 입력하세요");
        a = S.nextInt();

        if (a == 0)
            System.out.printf("홀입니다 \n");
        else
            System.out.printf("짝입니다 \n");


    }
}
