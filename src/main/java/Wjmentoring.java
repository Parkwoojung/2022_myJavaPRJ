public class Wjmentoring {
    public static void main(String[] args) {


        for (int i = 3; i < 10; i++) { //9번 돌아갈 때마다 1번씩 돌아감


            if (i%3 == 0) { //i는 3의 배수일 때만 출력
                System.out.println("<"+i+">단 입니다.");

            }
            for (int j = 2; j < 9; j++) { //9번 돌아감
                System.out.println(i +"*"+ j+"="+i * j);


            } //2중 for문 for문 안에 for문
        }
    }
}
