package src;

public class Session4FactorialWithRecursive {
    public static void main(String[] args) {
        int varNumber = factorial(4);
        System.out.println(varNumber);
    }

    public static Integer factorial(int number) {

        int result = 1;
        while (number != 0) {
            result = result * number ;
            number--;
        }
        return result;
    }
}
