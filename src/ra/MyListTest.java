package ra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
//        List<String> lisst = new ArrayList<>();
//        lisst.add(0,"Hungf");
//        lisst.add(0,"Nam");
//        System.out.println(lisst);
//        lisst.remove(100);
        MyList<String> listString = new MyList<>(2);
        listString.add(0,"Hung");
        listString.add(1,"Nam");
        listString.add(1,"Đức");
        listString.add(2,"Vinh");
        listString.add(2,"Hoàng");
        listString.remove(2);
        System.out.println(listString.contains("Vinh"));
        listString.ensureCapacity(10);
        listString.clear();
        System.out.println(listString);
    }
}
