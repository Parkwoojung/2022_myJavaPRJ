public class Ex06_05 {
    public static void main(String[] args) {
        //for문 i값이 1부터 시작일 때
        int i;

        for (i = 1; i <= 5; i++){
            System.out.printf("%d \n", i);
        }
    }
}
//컴퓨터는 0부터 시작하기 때문에 i=0이라고 지정하는 것이 좋지만,
//그렇게 하지 않을 때 i=1일 때 <=을 사용하거나 <6으로 지정하면 5개가 출력됨
