import java.util.Scanner;

public class M7test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//
        int b = 1;

        while(b<10){
            System.out.printf("%d X %d = %d \n", a, b, a*b);
            b++;
        }

    }
}
