import java.util.ArrayList;
import java.util.List;

/**
 * Created by caibaolong on 2019/6/11.
 */
public class TreeTest {
    public static void main(String[] args) {
        List<Integer> originArray = new ArrayList<>();
        for (int i = 0; i < 40000; i++) {
            originArray.add ((int) (Math.random() * 40000));
        }
//        System.out.println(originArray);
        List<Integer> originArray2 = new ArrayList<>();
        originArray2.addAll(originArray);
        testTime(1, originArray);
        testTime(2, originArray2);


    }

    public static void testTime(int no, List<Integer> list) {
        long startTime = System.currentTimeMillis();
        switch (no) {
            case 1: tree(list);break;
            case 2: pop(list);break;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("spend time : " + (endTime - startTime) + "ms");
    }

    public static void tree(List<Integer> list) {
        System.out.println("tree start:");

        Node roots = new Node();
        for (Integer number : list) {
            roots.add(number);
        }
//        System.out.println(roots.values());
    }

    public static void pop(List<Integer> list) {
        System.out.println("pop start:");

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }
            }
        }
//        System.out.println(roots.values());
    }
}
