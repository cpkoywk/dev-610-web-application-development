public class e3q13 {
    public static void main(String[] args) {
        pay(5.50, 6);
        pay(4, 11);
    }
    public static void pay(double salary, int hours) {
        if (hours <= 8) {
            System.out.println(salary * hours);
        } else {
            System.out.println(salary * 8 + salary * 1.5 * (hours - 8));
    }
}}

    