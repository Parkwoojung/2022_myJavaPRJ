public class Mtest02 {
    public static void main(String[] args) {

        int i = 2;//단
        int j = 1;//곱해지는 수

        while(i<10){
            while(j<10){ //곱해지는 수
                System.out.println(i+ "x" +j +"="+i*j +"입니다.");
                j++;
            }
            System.out.println(" ");
            j=1;
            i++;
        }
    }
}