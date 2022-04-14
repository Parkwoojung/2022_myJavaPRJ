public class Wjstar_09 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++){
            for (int k = 0; k < 6; k++){
                if (k<6-i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}