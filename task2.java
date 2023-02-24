
/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(
                Arrays.asList(2, 3, 3, 4, 9, 7, 2, 3));
        System.out.print(nums);
        System.out.println();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                nums.remove(i);
                i -= 1;
            }
        }
        System.out.print(nums);
    }
}