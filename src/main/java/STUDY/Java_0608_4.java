package STUDY;

public class Java_0608_4 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try{
            if(b==0)
                throw new Exception("0으로 나누려고요? 안됩니다."); //에러원인을 써줌

            result = a / b;
        } catch (Exception e){ //e는 에러원인 설명 메시지지            System.out.print("발생오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}
