public class Ex08_06 {
    public static void main(String[] args) {
        int aa[] = {10, 20, 30, 40, 50, 60, 70, 80} ;
        int count, size;

        count = aa.length;
        size = count * Integer.BYTES; //숫자 배열은 한 개당 2바이트, 두 개에 4바이트

        System.out.printf("배열 aa[]의 요소의 개수는 %d개 입니다.", count);
        System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트 입니다. \n", size);
    }
}
