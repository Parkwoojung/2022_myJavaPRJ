public class Ex07_07 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 100; i++) {
            System.out.printf("for문을 %d회 실행했습니다. \n", i);
    break; //for문 안에 작성 해야 for문을 한 번만 실행하게됨
        }

        System.out.printf("for문을 종료했습니다. \n");

    }
}
