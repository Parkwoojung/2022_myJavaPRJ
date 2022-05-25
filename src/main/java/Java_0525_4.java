public class Java_0525_4 {
    public static void main(String[] args) {
        String str = "Java Programming";
        String str1 = "Java Programming";
        String str2 = "Java Programming";
        String str3 = new String("Java Programming");

        System.out.println("원 문자열1 ==> ["+ str1 +"]");
        System.out.println("원 문자열2 ==> ["+ str2 +"]");
        System.out.println("원 문자열3 ==> ["+ str3 +"] \n");

        System.out.println("문자열1==문자열2 결과: \t + (str1 == str2)"); //==비교 방식은 같은 메모리에 있는 값을 참조하느냐 안하느냐를 비교함
        System.out.println("문자열1.equals(문자열2) 결과: " +str1.equals(str2));
        System.out.println("문자열1==문자열3 결과: \t" + (str1==str3));
        System.out.println("문자열1.equals(문자열3) 결과: "+str1.equals(str3));

        System.out.println("문자열 1과 문자열2가 다른지 비교 compareTo 안쓰고 이렇게 함: "+ !str.equals(str1));
    }
}
