package metanit.lambda.app4;

public class LambdaApp {

    private static Operarion action(int number) {
        switch (number) {
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x - y;
            case 3:
                return (x, y) -> x * y;
            default:
                return (x, y) -> 0;
        }
    }

    public static void main(String[] args) {

        Operarion func = action(9);
        int a = func.execute(6, 2);
        System.out.println(a);
        int b = action(3).execute(3, 9);
        System.out.println(b);
    }
}
