public class M6test {
    public static void main(String[] args) {

        Loop1:
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
//                    break Loop1;
                      break;
//                    continue Loop1;
//                    continue;
                }
            }
            System.out.println("그냥 break!!!!");
        }
        System.out.println("이름 붙힌 break, continue!!");
    }
} //break문은 근접한 반복문을 탈출함. 여러 개 쌓이면 완전히 탈출 불가
//2중 for문일 경우 내부만 나감. 외부는 탈출 못함
