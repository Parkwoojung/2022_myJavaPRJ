package STUDY;

import java.util.Scanner;

public class Java_0630_1 {
    public static void main(String[] args) {
        System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt(); //화면을 통해 입력받은 숫자르 user에 저장
        int com = (int) (Math.random() * 3) + 1; //1,2,3 중 하나가 com에저장

        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴퓨터는 " + com + "입니다.");

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1:
            case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break; //마지막문장 break사용할필요없음.
        }
    }
}