package org.example.functional;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Organizer {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jake", Gender.MALE));
        people.add(new Person("Jane", Gender.FEMALE));
        people.add(new Person("Mike", Gender.MALE));
        people.add(new Person("Bruce", Gender.MALE));
        people.add(new Person("Lily", Gender.FEMALE));

        //Reduce many lines of code thanks to streams, lambdas and functional interfaces
        people.stream().filter(p -> Gender.FEMALE.equals(p.getGender())).forEach(System.out::println);


        //Test out Function: takes something, returns something
        Function<Integer, Integer> increment = number -> ++number;
        Function<Integer, Integer> multByTen = number -> number * 10;
        BiFunction<String, String, String> combineAndUpperCase = (first, second) -> first.concat(second).toUpperCase();

        //Composed functions
        System.out.println(increment.andThen(multByTen).apply(2)); //returns 20
        System.out.println(combineAndUpperCase.apply("con", "cat")); //returns CONCAT

        //Test out Consumer: takes something, does something with it but returns nothing
        Consumer<String> printFirstLetter = word -> System.out.println(word.charAt(0));
        printFirstLetter.accept("First");

        //Test out Supplier: takes nothing, returns something
        Supplier<Integer> daysThisMonth = () -> {
            TemporalAccessor localDate = LocalDate.now();
            return YearMonth.from(localDate).lengthOfMonth();
        };

        System.out.println("This month has " + daysThisMonth.get() + " days");

        //Test out Predicate: takes something, returns boolean
        Predicate<String> startsWithS = word -> word.startsWith("S");

        System.out.println("word Java starts with S: " + startsWithS.test("Java"));
        System.out.println("word String starts with S: " + startsWithS.test("String"));
    }
}
