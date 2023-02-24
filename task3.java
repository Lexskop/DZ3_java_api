/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(
                Arrays.asList(1, 6, 5, 4, 9, 7, 2, 3, 10));
        double sum = 0;
        System.out.print(nums);
        System.out.println();
        Collections.sort(nums);
        System.out.printf("Минимальное значение: %s\nСреднее значение: %s\nМаксимальное значение: %s\n", nums.get(0),
                nums.get(nums.size() / 2), nums.get(nums.size() - 1));
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        System.out.printf("Среднее-арифметическое: %.2f", sum / nums.size()); // Просто я не понял вопрос - среднее или
                                                                              // среднее-арифметическое в массиве
    }
}