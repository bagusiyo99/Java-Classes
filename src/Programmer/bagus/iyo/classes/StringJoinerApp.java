package Programmer.bagus.iyo.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("," , "[", "]");

        joiner.add("bagus iyoooo fgf");
        joiner.add("bagus aha ");



        String value = joiner.toString();
        System.out.println(value);


    }
}
