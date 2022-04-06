import java.util.Scanner;
public class Ex05_09 {
    public static void main(String[] args) {
//220406 switch 구문
        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("1~4중에 선택하세요: ");
        a = s.nextInt( );

        switch (a) {
            case 1:
                System.out.printf("1을 선택했다 \n");
                break;

            case 2:
                System.out.printf("2를 선택했다 \n");
                break;

            case 3:
                System.out.printf("3을 선택했다 \n");
                break;

            case 4:
                System.out.printf("4를 선택했다 \n");
                break;

            default:
                System.out.printf("이상한 걸 선택했다. \n");

        }


    }
}
//switch (a) 안에 있는 a의 값이 case a: 와 같아야만 sout문이 실행됨
//break문이 있어야 case가 한 번 실행되고 멈추게됨 => case와 break는 같이 써야함