public class Java_0518_6 {
    public static void main(String[] args) {
        String str = "   한글  ABCD efgh   ";

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("대문자열 ==> [" + str.toUpperCase() + "]");
        System.out.println("소문자열 ==> [" + str.toLowerCase() + "]");
        System.out.println("공백제거 ==> [" + str.trim() + "]");
        System.out.println("공백제거 ==> [" + str.replaceAll(  " ",  ""+"]"));

    }
}
