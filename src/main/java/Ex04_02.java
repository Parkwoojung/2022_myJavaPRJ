public class Ex04_02 {
    public static void main(String[] args) {

        int a = 2, b = 3, c = 4;
        int result1, mok, namugi;
        float result2;

        result1 = a + b - c;
        System.out.printf("%d + %d - %d = %d \n", a,b,c, result1);

        result1 = a + b * c; //연산자 우선순위 법칙
        System.out.printf("%d + %d *%d = %d \n", a,b,c, result1);

        result2 = a * b / (float) c; //강제 형 변환: c앞에 float 로 데이터 타입 변환 => 4에서 4.0으로 변경
        //실수 4.0과 3이 나눠지면 결과값은 실수로 출력
        System.out.printf("%d * %d / %d = %f \n", a, b, c, result2);

        mok  = c / b;
        System.out.printf("%d / %d의 몫은 %d \n", c, b, mok);

        namugi = c % b;
        System.out.printf("%d / %d 의 나머지는 %d \n", c, b, namugi);
    }
}
