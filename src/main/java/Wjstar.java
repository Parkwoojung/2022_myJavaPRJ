public class Wjstar {
    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {


            for (int j = 0; j <= 5; j++) {

                if (j < 5 - i) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");

                }

            }
            System.out.println();
        } //큰 for문 안에서 맨 끝에 줄바꿈하기
    }
}