public class Ex03_05 {
    public static void main(String[] args) {
        System.out.printf("%d\n", 123);
        System.out.printf("%5d\n", 123); //%5 => 데이터(123)를 출력할 수 있는 공간을 최대 5칸으로 잡아놓고 출력해라
        //결과값 => --123으로 출력됨 앞에 두 칸을 비워놓고 뒤에부터 출력됨
        System.out.printf("05d\n", 123);

        System.out.printf("%f\n", 123.45); //데이터가 실수인 경우 %f, 데이터가 정수인 경우 %d
        System.out.printf("%7.1f\n", 123.45); //7칸을 잡아놓고 .1칸 총 6자리에 123.45를 출력해라, 반올림해서 123.5
        System.out.printf("%7.3f\n", 123.45); //7칸을 잡아놓고 . 소수점을 기준으로 뒤에 3칸이 더 붙는다
        // 소수점 뒤에 입력되는 숫자가 크면 반올림 가능, 숫자가 작으면 칸이 좁기 대문에 잘림

        System.out.printf("%s\n", "Hi~Java");
        System.out.printf("%10s\n", "Hi~Java");

        //%d, %f, %s 외우기
        //\n => 줄 바꿈, \t 다음탭으로 이동


    }
}
