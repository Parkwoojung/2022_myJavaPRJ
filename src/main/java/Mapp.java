import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "박우정");
        map.put("email", "lowell0322@naver.com");
        map.put("dept", "데이터분석과");

        System.out.println("--------------------------");

        System.out.println("name: "+map.get("name"));
        System.out.println("email: "+map.get("email"));
        System.out.println("dept: "+map.get("dept"));

        System.out.println("--------------------------");

    }
}