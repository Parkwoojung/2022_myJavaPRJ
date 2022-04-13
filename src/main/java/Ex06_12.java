import java.util.Scanner;

public class Ex06_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dan;

        System.out.println("몇 단?");
        dan = s.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d  *  %d = %d \n", dan, i , dan*i );
        }
    }
}
