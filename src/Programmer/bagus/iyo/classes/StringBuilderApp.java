package Programmer.bagus.iyo.classes;

public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("bagus");
        builder.append(" ");
        builder.append("iyo");
        builder.append("   ");
        builder.append("praass");

        String name = builder.toString();
        System.out.println(name);

    }

}
