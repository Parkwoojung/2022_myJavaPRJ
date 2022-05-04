import java.sql.SQLOutput;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
       int z = sc.nextInt();
          //80 70 a
         //69-60 b
         //59-50 c

        if (z<=100&&z>=70) {
            System.out.println("a");

        } else if(z>=60){
            System.out.println("b");

        } else if(z>=49){
            System.out.println("c");
        } else{
            System.out.println("알 수 없습니다.");
        }



    }
}