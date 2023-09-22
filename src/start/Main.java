package start;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(10, 159, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        returnEvenDigits(nums);
        printEvenWithoutRepeat(nums);
    }

    public static void returnEvenDigits(List<Integer> value) {
        value.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 == 0) {
                    System.out.print(integer + " ");
                }
            }
        });
        System.out.println();
    }

    public static void printEvenWithoutRepeat(List<Integer> value) {
        Set<Integer> setOfValues = new HashSet<>(value);
        for (Integer num : setOfValues) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}



