import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //메모리에 올려라! arraylist 방식으로data를 구현할 것이라고 정의,
        //정렬할 때는 linkedlist가 빠름

        list.add("박우정"); //list에 "박우정" 을 추가
        list.add("박우영");
        list.add("박우동");
        list.add("동동동");

        int listSize = list.size();

        for (int i = 0; i < listSize; i++){
            System.out.println("이름: " + list.get(i));
        }
    }

}
