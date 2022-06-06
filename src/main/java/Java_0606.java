import java.util.Scanner;

public class Java_0606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int cnt = 0;
        int l = i;

        while(true) {

            int t = (l / 10); // 10의 자리수 2
            int k = (l % 10); // 1의 자리수 6
            int j = t + k; //1+10의 자리수 8
            int u = ((k * 10) + (j % 10)); //그 다음 10의 자리수
            cnt += 1;

            if(i==u){
                break;

            }
            l=u;
        } System.out.println(cnt);

    }
}