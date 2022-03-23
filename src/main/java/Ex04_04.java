public class Ex04_04 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++; // b=a를 수행한 다음 a를 1 증가시킨다.
        //b에 a+1을 하기 전에 b안에 먼저 a값을 저장하고, a+!실행 b = a하고 ++실행
        System.out.printf("%d \n", b);

        b = ++a; //a를 1 증가시킨 다음에 b=a를 수행한다.
        // a값에 +1을 먼저하고 b에 값을 저장. ++ = +1
        System.out.printf("%d \n", b);
    }
}
