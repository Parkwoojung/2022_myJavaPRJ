import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {

      List<String>list = new ArrayList<>();

      list.add("우동");
      list.add("나나");
      list.add("복숭아");

      int listSize = list.size();

      for (int i = 0; i < listSize; i++){
          System.out.println("이름 : " + list.get(i));
      }
    }
}
