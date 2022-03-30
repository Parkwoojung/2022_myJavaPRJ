public class Method {
    public static void main (String[] args){
        System.out.printf("%d\n", 123);
        System.out.printf("%5d\n", 123);
        System.out.printf("%05d\n", 123);

        System.out.printf("%05d\n", 123);
        System.out.printf("&7.1f\n", 123.45);
        System.out.printf("&7.3f\n", 123.45);

        System.out.printf("%s\n", "Hi~Java");
        System.out.printf("%10s\n", "Hi~Java");

        //%d => 정수형 서식
        //%f => 실수형 서식
        //%s => 문자열형 서식

        //%d => 숫자의 자릴수만큼 정렬함
        //%5d => 오른쪽에 붙여서 정렬 (앞에 붙은 숫자만큼 자리 확보함 5자리 확보됨
        // ex) 123이라면 앞에 두 자리는 빈공간으로 남김
        //%05 => 오른쪽에 붙여서 빈칸을 0으로 채워서 정렬함 123이라면 00123

        //%f => 소수점 아래 여섯자리까지 무조건 출력함 ex) 123.450000
        //&7.1f => 앞에 붙은 숫자 7만큼 자리 확보. 소수점 아래 첫째자리만 출력됨 ex) ^^123.5
        //%7.3f => 소수점 아래 셋째 자리까지 출력. 오른쪽 빈칸은 0으로 채움
    }
}
