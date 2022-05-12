import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("우동이");
        list.add("베이커리");
        list.add("산책");

        int listSize = list.size();

        for (int i = 0; i < listSize; i++){
            System.out.println("할 일: " + list.get(i));        }
    }
}
