public class Wjstar_09 {
    public static void main(String[] args) {
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
