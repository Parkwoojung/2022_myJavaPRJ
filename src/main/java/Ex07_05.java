public class Ex07_05 {
    public static void main(String[] args) {
        int a = 100;

        while (a == 200){
            System.out.printf("while문 내부에 들어 왔습니다 \n");
        }
        do {
            System.out.printf("do ~ while 문 내부에 들어 왔습니다 \n");
        } while (a==200);
    }
} //do while은 조건이 참이든 참이지 않든 한 번은 실행함
