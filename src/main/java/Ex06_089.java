public class Ex06_089 {
    public static void main(String[] args) {
        int hap = 1;
        int i;

        for (i = 5; i > 0; i--){
            hap *= i;

        System.out.println("중간 계산 값: " +hap);

        }
           System.out.println("5! 값은: " + hap);
    }
}
