public class Ex04_01 {

    public static void main(String[] args) {
        int a, b = 5, c = 3;

        a = b + c;
        System.out.printf("%d + %d = %d \n", b, c, a);

        a = b - c;
        System.out.printf("%d - %d = %d \n", b, c, a);

        a = b / c;
        System.out.printf("%d / %d = %d \n", b, c, a);

        a = b % c;
        System.out.printf("%d %% = %d \n", b, c, a); //%%가 두 개 인 이유: 결과값에 %로 출력하기 위해
    }
}
