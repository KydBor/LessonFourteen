package HomeWork;

public class Task3 {
    public static void main (String[] args){
        TaskThree sum = (a, b) -> a + b;
        TaskThree dif = (a, b) -> a - b;
        TaskThree div = (a, b) -> a * b;
        TaskThree mult = (a, b) -> a / b;
        System.out.println(sum.calc(5, 6));
        System.out.println(dif.calc(5, 6));
        System.out.println(div.calc(5, 6));
        System.out.println(mult.calc(5, 6));
    }
}
