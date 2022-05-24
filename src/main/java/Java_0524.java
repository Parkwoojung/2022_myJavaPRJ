import java.util.TreeSet;

public class Java_0524{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("박우정0");
        ts.add("박우정1");
        ts.add("박우정2");
        ts.add("박우정3");

        System.out.println("TreeSet은 값 추가시 정렬로직 지원");
        for (String s : ts){
            System.out.println(s);
        }

        ts.forEach(fruit -> System.out.println("람다식으로 출력 :"+fruit));
    }
}