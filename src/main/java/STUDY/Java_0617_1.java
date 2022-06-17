package STUDY;

import java.util.Scanner;

public class Java_0617_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] aa = new int[n];

        for(int k = 0; k < n; k++){
            aa[k] = sc.nextInt( );
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(aa[j]);
            }
        }

    }
}