public class Wjstar04_java {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) { //줄 수
            for (int j = 0; j <= 5; j++) { //별 개수 조건
                if (j < 5 - i) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
