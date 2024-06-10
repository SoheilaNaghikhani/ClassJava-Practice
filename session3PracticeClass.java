import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class session3PracticeClass {
    public static void main(String[] args) {
        final int x=5;
      //  x=10;
        int y=10;
        y=15;
        String str1="Heloo";
        String str2=new String("Heloo");
        String name="Soheila Naghikhani";
        String name1="Bahareh Ashenagar";
        System.out.println("Lenght Soheila Naghikhani : "+name.length());
        System.out.println("charAt(2) of  Soheila Naghikhani : " + name.charAt(2));
        System.out.println("charAt(2) of  Soheila Naghikhani : " + name.charAt(name.length()-1));
        System.out.println("substring(2,9) of  Soheila Naghikhani " + name.substring(2,9));
        System.out.println("concat : " + name.concat(" " + name1));
        System.out.println( "equals : " + name.equals(name1));
        System.out.println("replace Soheila with Soli : " + name.replace("Soheila","Soli"));
        System.out.println(name.replace('S','n'));

        String str=String.format("Stringformat :  hello %s  bye %s","soli ," , "Today");
        System.out.println(str);
        String str3=String.format("Name : %s Family : %s ","Soheila , ","Naghikhani");
        System.out.println(str3);
        String name2="     Soheila Naghikhani";
        System.out.println(name2);
        System.out.println(name2.trim());

        String name3="Soli,Nadia,Mona";
        String[] s=name3.split(",");
        System.out.println("split : " + Arrays.toString(s));


        StringBuffer sb=new StringBuffer();
        sb
                .append("بانک پاسارگاد ").append("\n")
                .append("hello")
                .append(" to")
                .append(" all")
                .append(" coworkers");
        System.out.println(sb);





    }
}
