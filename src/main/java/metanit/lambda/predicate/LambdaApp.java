package metanit.lambda.predicate;

import java.util.function.Predicate;

public class LambdaApp {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(0));
    }
}
