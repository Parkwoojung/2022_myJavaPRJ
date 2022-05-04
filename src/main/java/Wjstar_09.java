public class Wjstar_09 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {

                if (k<10- i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }

        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){

                if (x < y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
}
