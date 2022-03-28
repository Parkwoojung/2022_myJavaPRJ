//220316 변수 선언 int, float 학습

public class Ex03_07 {
    public static void main(String[] args) {
        int a;
        float b;

        a = (int) 123.45f; //실수는 정수로 변경 하라는 명령 , 실수는 무조건 정수를 가지고 있음
        b = 200;

        System.out.printf("a의 값 ==> %d \n", a);
        System.out.printf("b의 값 ==> %f \n", b);
    }
}
