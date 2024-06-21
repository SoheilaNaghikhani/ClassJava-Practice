package src;

public class Session5HandsUpLengthLastStringWithString {
    public static void main(String[] args) {
        String sentences = "HelloMycoworkers";
        int length = calculateLenghtWithFor(sentences);
        System.out.println("length : " + length);
    }

    public static Integer calculateLenghtWithFor(String str) {
        int lengthLastWord = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            String char1 = str.substring(i, i + 1);
            if (char1.equals(" ")) {
                String word = str.substring(i + 1, str.length());
                lengthLastWord = word.length();
                break;
            }
        }
        if (!str.contains(" ")){
            lengthLastWord=str.length();
        }
        return lengthLastWord;
    }
}

