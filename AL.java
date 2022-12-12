import java.util.ArrayList;
import java.util.Collections;
public class AL {
    public static void main(String[] args) {
        System.out.println("Empty,Add,Insert,Get,Set,Sort,Max,Min,Delete,Contains,Clear");
    ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list.isEmpty());
    list.add(4);
    list.add(2);
    list.add(7);
        System.out.println(list);

        list.add(1,3);
        System.out.println("Insert : "+ list);

        System.out.println("Get : " +list.get(0));

        list.set(3,5);
        System.out.println("Set : "+ list);

        Collections.sort(list);
        System.out.println("Sort : "+ list);

        System.out.println("Max :"+Collections.max(list));
        System.out.println("Min : "+Collections.min(list));

        list.remove(2);
        System.out.println("After Removing : "+ list);
        System.out.println("Get Remove Element : " +list.remove(0));

        System.out.println(list);
        System.out.println("Contains : " +list.contains(4));  //In Contain Number pass the Contain Method

        list.clear();
        System.out.println(list);
    }
}
