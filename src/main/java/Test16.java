import java.util.Scanner;
public class Test16 {
    //switch case 문은 case에 지정된 수가 스캐너와 같은 값일 때 같은 수의 구문이 실행됨
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("1~4 중에 선택하세용: ");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.printf("1을 선택했다 \n");
                break;

            case 2:
                System.out.printf("2를 선택했다 \n");
                break;

            case 3:
                System.out.printf(" 3을 선택했다 \n");
                break;

            case 4:
                System.out.printf("4를 선택했다 \n");
                break;

            default:
                System.out.printf("이상한 걸 선택했어용 \n");

        }


    }
}
