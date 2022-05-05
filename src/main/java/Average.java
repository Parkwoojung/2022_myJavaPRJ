import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float average = 0;
        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i = 0; i<a; i++){
            arr[i] = sc.nextInt();

            sum += arr[i];
        }
        average = sum / a;
        System.out.println("총점은? : " +sum);
        System.out.println("평균점수는?  : " + average);
    }
}