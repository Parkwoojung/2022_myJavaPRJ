public class Test23 {
    public static void main(String[] args) {
        //3의 배수, 5의 배수만 덧셈
        int hap = 0;

        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                hap += i;

            }
        }
        System.out.println(hap);
    }
}