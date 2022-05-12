public class M5test {
    public static void main(String[] args) {

        int sum = 0;

        for(int i  = 1; i <= 10; i++){
            if(i%3 ==0){
                continue;
            }
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
//continue문은 반복문 내에서만 사용 가능함
//for문의 경우 증감식으로 이동 while do-while은 조건식으로 이동함
//if문과 함께 사용 -> 특정 조건일 때 구문 무시함