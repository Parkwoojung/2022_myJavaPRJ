import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();

        a.add("박우정");
        a.add("박우영");

        int listSize = a.size();

        System.out.println("기본적인 for문으로 list객체에 저장된 데이터 출력");

    }
}
