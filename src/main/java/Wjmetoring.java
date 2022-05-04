import java.util.Scanner;

public class Wjmetoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요:");
        int num = sc.nextInt(); // int a = 3;


        if (95>=num&&num>=80) {
            System.out.printf("A입니다.");

        } else if (70>=num&&num>=60){
            System.out.printf("B입니다.");

        } else if (50>=num&&num>=40){
            System.out.printf("C입니다.");

        } else {
            System.out.println("공부를 더 열심히 하세요.");
        }
    }
}
