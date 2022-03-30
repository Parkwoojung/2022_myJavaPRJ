public class Ex05_07 {
    public static void main(String[] args) {
        //175p 중첩 if문

        int a = 75;

        if (a > 50) {

            if (a < 100) {
                System.out.printf("와 50보다 크고 100보다 작군요 \n");

            } else {
                System.out.printf("와 100보다 크군요 \n");
            }

            } else {
                System.out.printf("애개 50보다 작군요 \n");

        }
    }
}

//a == 75
//a는 50보다 큰 값임 즉, 참이기 때문에 9~12 구문이 출력됨