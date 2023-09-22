package start;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(10, 159, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("10", "159", "1", "1", "2", "3", "4",
                "4", "5", "5", "6", "7"));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        returnNotEvenDigits(nums);
        printEvenWithoutRepeat(nums);
        printUniqueWord(words);
        printDoubles(words);
    }

    public static void returnNotEvenDigits(List<Integer> value) {
        value.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 != 0) {
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

    public static void printUniqueWord(List<String> words) {
        Set<String> setWords = new HashSet<>(words);
        System.out.print(setWords + "\n");
    }

    public static void printDoubles(List<String> words) {
        List<String> copyList = new ArrayList<>(words);
        for (int i = 0; i < copyList.size(); i++) {
            int counter = 1;
            for (int j = i + 1; j < copyList.size(); j++) {
                if (copyList.get(j).equals(copyList.get(i))) {
                    copyList.remove(j);
                    counter++;
                }
            }
            System.out.print(counter + " ");
        }
    }
}




