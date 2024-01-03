import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        String text = "text";

        List<String> list2 = new ArrayList<>();
        list2.add("t");
        list2.add("e");
        list2.add("e");
        list2.add("t");


        List<String> list = new ArrayList<>();
        list.add("t");
        list.add("e");
        list.add("x");
        list.add("t");


        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            for (int i = 0; i < list.size()/2; i++) {
                if (list.get(i)==listIterator.previous()){
                    System.out.println(true);
                }
                else {
                    System.out.println(false);
                }
            }

        }




    }
}