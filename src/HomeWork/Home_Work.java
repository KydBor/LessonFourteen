package HomeWork;

public class Home_Work {
/*    public static void main (String[] args) {

        Operationable operation;
        operation = (x, y) -> x + y;

        int result = operation.calculate(5, 8);
        System.out.println(result);
    }*/

/*    public static void main (String[] args) {
        Operationable operation = new Operationable() {

            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        int z = operation.calculate(5, 18);
        System.out.println(z);
    }*/

/*    public static void main (String[] args) {
        Operationable operation1 = (int x, int y) -> x + y;
        Operationable operation2 = (int x, int y) -> x - y;
        Operationable operation3 = (int x, int y) -> x * y;

        System.out.println(operation1.calculate(10, 10));
        System.out.println(operation2.calculate(10, 10));
        System.out.println(operation3.calculate(10, 10));
    }*/

/*    public static void main (String[] args) {
        Operationable printer = s -> System.out.println(s);
        printer.print("Hello World");
    }*/

/*    static int x = 10;
    static int y = 20;
    public static void main (String[] args) {
        Operationable operation = () -> {

            x = 30;
            return x + y;
        };

        System.out.println(operation.calculate());
        System.out.println(x);
    }*/

/*    public static void main (String[] args) {
        int n = 30;
        int m = 70;

        Operationable op = () -> {

            return n + m;
        };
        System.out.println(op.calculate());
    }*/

/*    public static void main (String[] args) {
        Operationable operation = (int x, int y) -> {

            if (y == 0)
                return 0;
            else
                return x / y;
        };

        System.out.println(operation.calculate(20, 10));
        System.out.println(operation.calculate(20, 0));
    }*/

    public static void main (String[] args) {
        Operationable <Integer> operation1 = (x, y) -> x + y;
        Operationable <String> operation2 = (x, y) -> x + y;

        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate("20", "10"));
    }
}
