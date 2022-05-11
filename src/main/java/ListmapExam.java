import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListmapExam {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("name", "박우정");
        map.put("email", "lowell0322@naver.com");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과"); //map이라는 변수

        list.add(map); //list.add(map)을 추가.

        map = null; //박우정이라는 name 데이터값이 있는데 박우정이라는 새로운 값을 넣고싶음
        // null이라는 값을 map에 넣으면 값이 모두 지워짐 new HashMap 구문이 풀림=>데이터가 지워짐

        map = new HashMap<>(); //다시 map을 넣자!

        map.put("name", "박우정");
        map.put("email", "lowell0322@naver.com");
        map.put("addr", "서울");
        map.put("dept", "데이터분석과");

        list.add(map);

        map = null; //다 쓴 변수는 null을 통해 날리자 -> Garbage collection이 제대로 안 돌아갈수도잇음

        int listSize = list.size();

        for(int i = 0; i < listSize; i++){

            Map rMap = list.get(i); //rMap이라는 변수에 name, email 등의 데이터를 넣어서 출력함ㅌ
            System.out.println("name: " + rMap.get("name"));
            System.out.println("email: " + rMap.get("email"));
            System.out.println("addr: " + rMap.get("addr"));
            System.out.println("dept: " + rMap.get("dept"));
        }

    }
}
