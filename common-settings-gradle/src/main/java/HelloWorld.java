import java.util.stream.Stream;

public class HelloWorld {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).map(n -> '#' + String.valueOf(n)).forEach(System.out::println);
    }
}
