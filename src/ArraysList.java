import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args) {

        int[] array = {1, 5, 7, 6, 10, 2, 4, 3, 8};

       ArrayList<Integer> arrays = new ArrayList<Integer>();

        for (int item : array) {
            if (item % 2 == 0) {
                arrays.add(item);
            }
        }
        System.out.print(arrays.toString());
    }
}
