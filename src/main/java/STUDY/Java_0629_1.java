package STUDY;1

import java.util.Scanner;

public class Java_0629_1 {
        public static void main(String[] args) {
            Java_0629_1 Ja = new Java_0629_1();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Ja.solution(n);
        }


        public int solution(int n) {
            int answer = 0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    answer+=i;
                }
            }
            return answer;
        }
    }

