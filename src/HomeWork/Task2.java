package HomeWork;

public class Task2 {
    public static void main (String[] args) {
        TaskTwo taskTwo = (a) -> {
            if ((a % 2) == 0) {
                System.out.println("Число чётное");
            } else {
                System.out.println("Число нечётное");
            }
        };
        taskTwo.logic(14);
    }
}
