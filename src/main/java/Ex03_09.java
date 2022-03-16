public class Ex03_09 {
    public static void main(String[] args) {
        int a, b, c, d;

        a  = 100 + 100;
        b = a + 100; //100에 a라는 변수를 더하기 (컴퓨터는 =을 기준으로 뒤부터 연산)
        c = a + b - 100;
        d = a + b + c;
        System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d\n", a,b,c,d); //정수 계산이기 때문에 %d를 사용함

        a= b= c= d = 100;
        System.out.printf("a, b, c, d 의 값 ==> %d, %d, %d, %d\n", a,b,c,d);

        a= 100;
        a = a+200;
        System.out.printf("a의 값 ==> %d\n", a);
    }
}
