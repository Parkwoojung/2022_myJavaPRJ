public class Test08 {
    public static void main(String[] args) {
        char a, b, c, d, e; //char문자형 변수 5개 선언

        a = 'A'; //문자형 변수 a에 'A' 대입
        System.out.printf("%c \t", a); //문자형 변수 a를 문자형
        System.out.printf("%d \n", (int) a); //정수형으로 출력함

        b = 'a'; //문자형 변수 b에 a를 대입함
        c = (char) (b+1); //문자형 변수 b에 1을 더해 문자형 변수 c에 대입, 결과는 char로 캐스팅
        System.out.printf("%c \t", b);
        System.out.printf("%c \n", c);

        d = 90;
        System.out.printf("%c \n", d); //문자형 변수 d에 숫자 90대입

        d = '가'; //문자형 변수 d에 한글 '가' 대입
        e = (char) (d+1); //문자형 변수 d에 1을 더해 문자형 변수 e에 대입. 결과는 char로 캐스팅팅        System.out.printf("%d \t", (int) d);
        System.out.printf("%c \n", e);
    }
}
