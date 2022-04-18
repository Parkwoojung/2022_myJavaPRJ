public class Test07 {
    public static void main(String[] args) {
        float a = 0.1234567890123456789012345f; //float형으로 만드려면 숫자뒤에 f를 붙어야함
        double b = 0.1234567890123456789012345;

        System.out.printf("%30.25f \n", a); //float형 변수 a에 정밀도 25자리 입력
        System.out.printf("%30.25f \n", b); //double형 변수 b에 정밀도 25자리 입력
    }
}
