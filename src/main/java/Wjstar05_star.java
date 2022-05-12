public class Wjstar05_star {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
for (int x = 0; x < 6; x++){
    for (int y = 0; y<6-x; y++) {
        System.out.print("*");
    }
    System.out.println("");
}
       }
    }

