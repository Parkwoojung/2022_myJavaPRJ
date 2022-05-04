public class M4test {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(true) {

            i+=1;
            if (i >= 10){
                System.out.println(i);
                break; //break 문은 자신이 포함된 가장 가까운 반복문을 벗어남
                      //if문과 함께 사용됨 특정 조건이 만족되면 반복문 탈출!
            }
        }
    }
}
