import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List lst = new ArrayList<>();
        lst.add("e1");
        lst.add("e3");
        lst.add("e2");

        int x1 = Collections.binarySearch(lst, "e3");
        System.out.println(x1);
        Collections.sort(lst);
        int x2 = Collections.binarySearch(lst, "x3");
        System.out.println(x2);

        Collections.reverse(lst);
        int x3 = Collections.binarySearch(lst, "e3");
        System.out.println(x3);

        /**
         * result:
         * 1
         * -4
         * -4
         */
    }
}
