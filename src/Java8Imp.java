import org.hamcrest.Condition;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Imp {
    public static void main(String[] args) {
        // Given a list of strings, write a Java 8 Stream program to group the strings by their length and count the number of strings in each group.
        List<String> words = List.of("apple", "banana", "fig", "date","cherry","Guava", "Apricot", "Mango", "Muskmelon");
       /* Map<Integer, Long> lengthOfString = words.stream().collect(Collectors.groupingBy(String:: length, Collectors.counting()));
        System.out.println(lengthOfString);*/

        //Given a list of integers, write a Java 8 Stream program to partition the numbers into two groups: even and odd.
       /* List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> evenOdd = number.stream().collect(Collectors.partitioningBy(n -> n%2 ==0));
        System.out.println(evenOdd);*/

        //Given a list of integers, write a Java 8 Stream program to find the second largest number in the list.
       /* List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);
        Optional<Integer> secondLargNo = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondLargNo.ifPresent(System.out::println);*/

      /*  List<String> words1 = Arrays.asList("apple", "banana", "cherry", "date");
        //String bigWord = words.stream().collect(Collectors.joining(","));
        String bigWord = String.join(",", words1);
        System.out.println(bigWord);*/

        //Given a list of strings, write a Java 8 Stream program to find the longest string in the list.
      /*  Optional<String> longestString = words.stream().max(Comparator.comparingInt(String::length));
        longestString.ifPresent(System.out::println);
        Optional<String> smallestString = words.stream().min(Comparator.comparingInt(String::length));
        smallestString.ifPresent(System.out::println);*/

      /*  OptionalInt maxlength = words.stream().mapToInt(String::length).max();
        List<String> maxStrings = words.stream().filter(word -> word.length() == maxlength.getAsInt()).toList();
        System.out.println(maxStrings);

        OptionalInt minLength = words.stream().mapToInt(String::length).min();
        List<String> minlengthList = words.stream().filter(word -> word.length() == minLength.getAsInt()).toList();
        System.out.println(minlengthList);*/

        //Given a list of strings, write a Java 8 Stream program to group the strings by their first letter.
        Map<Character, List<String>> groupByFirstLetter = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println(groupByFirstLetter);
    }




}
