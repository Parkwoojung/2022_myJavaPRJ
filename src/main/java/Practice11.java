import java.util.Scanner;
public class Practice11 {
    //홀.짝 복습
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a;

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt();

        if (a%2 ==0) {
            System.out.printf("짝수를 입력했군요..\n");
        } else {
            System.out.println("홀수를 입력했군요..\n");
        }

    }

}
