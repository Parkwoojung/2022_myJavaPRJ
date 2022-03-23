public class Ex04_05 {
    public static void main(String[] args) {
        int a = 100, b = 200;

        System.out.printf("%d == %d 는 %s 이다. \n", a, b, a == b); //100 == 200 는 false 이다.
        System.out.printf("%d != %d 는 %s 이다. \n", a, b, a != b); //100 != 200 는 true 이다.
        System.out.printf("%d > %d 는 %s 이다. \n", a, b, a > b); //100 > 200 는 false 이다.
        System.out.printf("%d < %d 는 %s 이다. \n", a, b, a < b); //100 < 200 는 true 이다.
        System.out.printf("%d >= %d 는 %s 이다. \n", a, b, a >= b); //100 >= 200 는 false 이다.
        System.out.printf("%d <== %d 는 %s 이다. \n", a, b, a <= b); // 100 <== 200 는 true 이다.

        System.out.printf("%d = %d 는 %s 이다. \n", a, b, a = b); //100 = 200 는 200 이다.
//==같다, !=같지 않다, >크다, <작다, >=크거나 같다, <=작거나 같다

    }
}
