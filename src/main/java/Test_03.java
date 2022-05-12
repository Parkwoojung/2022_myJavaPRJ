public class Test_03 {

    class Test{
        int c =1; //지역변수
    }
    public static void main (String [] args){
        //c=2;  지역변수 개념
        int a = 10;
        int b = 20;
        int result = a + b; //전역변수

        for(int x=0;x<10;x++){
            result=12; //전역변수
            int v=1; //지역변수
        }
        //v=2;지역변수

        System.out.printf("result: %d \n", result);
        System.out.println(

        );
    }
}
