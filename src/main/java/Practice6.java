public class Practice6 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 3; i++)
        {
            System.out.printf("안녕하세요? \n");
            System.out.printf("##또 안녕하세요?## \n");

        }
        System.out.printf("\n \n");

        for ( i = 0; i < 3; i++)
            System.out.printf("안녕하세요? \n");
            System.out.printf("##또 안녕하세요?## \n");
    }
}
//4~8행은 for문에서 수행할 두 문장을 중괄호로 묶었기 때문에 두 문장이 연달아 세 번 출력 되었다.
//12~14행은 13행만 세 번 반복해서 출력한 다음 14행 한 번만 출력되었다.
//여러 문장을 반복하려면 반드시 {중괄호} 필수