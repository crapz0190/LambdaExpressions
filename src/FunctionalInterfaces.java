import java.util.Scanner;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] str = input.nextLine().split(" ");

            String concatStr = Seven.fun.apply(str[0], str[1], str[2], str[3], str[4], str[5], str[6]);
            System.out.println(concatStr);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

// A lambda expression with seven arguments
class Seven {
    public static SeptenaryStringFunction fun = (s1, s2, s3, s4, s5, s6, s7) -> (s1 + s2 + s3 + s4 + s5 + s6 + s7).toUpperCase();
}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}