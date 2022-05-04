public class Test12 {
    public static void main(String[] args) {

        for (int i = 3; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                if (i % 3 == 0) {
                    System.out.printf("%d X %d = %d \n", i, j, (i*j));
                }
            }
        }
    }
}
