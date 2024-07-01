package src;

public class Session5PrimeNumber {
    public static void main(String[] args) {
        int number = 15;
        int calVar = calculate(number);
        if (calVar == 2) {
            System.out.println("عدد " + number+ " اول است ");
        } else {
            System.out.println("عدد " + number+ " مرکب است ");
        }
    }
    private static Integer calculate(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                counter++;
            }
        }
        return counter;
    }
}
