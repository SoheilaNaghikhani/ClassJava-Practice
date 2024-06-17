package src;

public class Session4FactorialWithRecursiveWithSearch {

        public static void main(String[] args) {
            int varNumber = factorial(4);
            System.out.println(varNumber);
        }

        public static Integer factorial(int number) {
            int result = 1;
            if (number > 1) {
                result = number * factorial(number - 1);

            }
            return result;
        }
    }


