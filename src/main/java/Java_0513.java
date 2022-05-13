import java.util.Scanner;

public class Java_0513 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10]; // 메모리 크기 10짜리 배열 선언
        for (int i = 0; i <a.length; i++) {
            a[i] = sc.nextInt();
        } // 배열의 길이만큼 숫자 입력.
        int k = sc.nextInt(); // k번째 숫자 k입력

        System.out.println(a[k-1]); // 0부터 시작하니까 -1해서 k번째 인덱스 값 출력
    }
}
