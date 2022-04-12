import java.util.Scanner;

public class Wjmulti {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dan;
        int i;

        System.out.println("몇 단?");
        dan = s.nextInt();

        for (i = 0; i < 9; i++) {
            System.out.printf("%d X %d = %d \n", dan, i, (dan * i));
        }

    }
}
