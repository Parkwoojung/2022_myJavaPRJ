public class Wjifelse1 {
    public static void main(String[] args) {
        int a = 200;

        if (a < 100)
            System.out.printf("100보다 작군요..\n");

        else
            System.out.printf("100보다 크군요..\n");
        //if문의 조건은 a < 100으로 int a 보다 100이 더 크기 때문에 성립이 되지 않음.
        //거짓이기 때문에 else가 출력되는 것
    }
}
