package STUDY;

import java.util.Scanner;

public class Java_0628_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] r = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            r[i] = s.nextInt();
        }


        int[] pri = new int[n];

        for (int i = 0; i < n; i++) {
            pri[i] = s.nextInt();
        }

        int min = pri[0];

        long answer=0;


        for(int i=0;i<n-1;i++) {

            if(min<=pri[i+1]) {
                answer+=min*r[i];
            }

            else {
                answer += min*r[i];
                min = pri[i+1];

            }
        }
        System.out.println(answer);
    }
}
