import java.util.LinkedList;
import java.util.List;

/**
 * Created by arnolf on 2017-05-04.
 */
public class Testing_Jenkins {

    List<Integer> list;

    public Testing_Jenkins() {
        list = new LinkedList<>();
    }

    private int[] sortList(int[] list) {

        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;

            for (j = i-1; j >= 0 && temp < list[j]; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = temp;
        }

        return list;
    }

    private void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Testing_Jenkins t = new Testing_Jenkins();
        int[] a = {5, 9, 5, 7, 8, 1, 4, 17, 9, 10, 2, 3, 6};

        System.out.println("A: \n");
        t.printArray(a);

        int[] b = t.sortList(a);

        System.out.println("\nB: \n");
        t.printArray(b);
    }
}
