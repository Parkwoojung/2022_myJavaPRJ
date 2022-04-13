public class Ex07_10 {
    public static void main(String[] args) {
        int hap = 0;

        for(int i = 1; i < 101; i++) {
            if(i % 3 == 0 )
                continue;

            hap += i;
        }
        System.out.printf("1~100까지의 합 (3의 배수 제외) : %d\n", hap);
//continue밑에 있는 구문 실행 안하고 바로 반복문 실행
    }
}
