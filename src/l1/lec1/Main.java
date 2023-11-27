package l1.lec1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> list = Arrays.asList(new User("Genome", 22), new User("Ivan", 21), new User("Frank", 63));

        list.stream().forEach(System.out::println);

//        list.stream().filter(str -> str.length() > 1).filter(str -> str.contains("i")).forEach(System.out::println);
    }

}