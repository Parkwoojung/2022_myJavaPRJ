package STUDY;

public class Java_0608_3 {
    public static void main(String[] args) {
       int [] aa = new int[3];
       try{
           aa[3] = 100;
           aa[2] = 100/0; //aa[3]=100 이라는 구문에서 에러가 났기 때문에 이 구문이 실행안됨
       } catch(ArrayIndexOutOfBoundsException e){ //얘랑 aa[3]이랑 같은 구문이니까 실행됨
           System.out.println("배열 첨자가 배열 크기보다 커요");
       } catch(ArithmeticException e){ //aa[2] = 100/0랑 똑같은 애라서 에러남
           System.out.println("0으로 나누는 등의 오류에요");
       } finally {
           System.out.println("finally은 무조건 실행돼요 "); //에러 발생 여부 상관없이 에러남
       }

    }
}
