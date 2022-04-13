public class Ex07_02 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for (i = 0; i < 5; i++){
            while (i < 11) {
                hap = hap + i;

                i++;
            }
            System.out.printf("1에서 10까지의 합: %d \n", hap);
        }
    }
}
