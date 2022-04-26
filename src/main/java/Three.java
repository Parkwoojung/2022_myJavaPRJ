import java.util.Scanner;
public class Three {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int num;
        System.out.println("1-99 사이의 정수를 입력하세용: ");
        num = a.nextInt();
        if(num == 3 || num == 6 || num == 9){
            System.out.println("박수짝!");
        }
        else if(num>=10){
            if(num%10 == 3 ||(num %10) == 6|| (num %10) ==9){
                if(num/10 == 3||num/10 == 6||num/10 == 9)
                    System.out.println("박수짝짝!!");
                else
                    System.out.println("박수짝!");
            }
            else if(num/10 == 3||num/10 == 6||num/10 == 9)
                System.out.println("박수짝!");
        }
    }
}
