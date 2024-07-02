package src;

public class Session5SemmetricalNumber {
    public static void main(String[] args) {
        int number = 123321;
        String strNumber = String.valueOf(number);
        Boolean b = survey(strNumber);
        if (b) {
            System.out.println("متقارن");
        } else {
            System.out.println("نامنقارن");
        }
    }

    public static Boolean survey(String strNumber) {
        int midStrNumber = strNumber.length() / 2;
        Boolean b = true;
        System.out.println(strNumber);
        for (int i = 0; i <= midStrNumber; i++) {
            String one = strNumber.substring(i, i + 1);
            String two = strNumber.substring(strNumber.length() - (i + 1), strNumber.length() - (i));
            int oneInt = Integer.valueOf(one);
            int twoInt = Integer.valueOf(two);
            if (oneInt != twoInt) {
                b = false;
                break;
            }
        }
        return b;
    }
}
