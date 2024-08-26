package src.practicegenericecompare;

import java.util.ArrayList;
import java.util.List;

public class MainCompareGeneric {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list1.add("Nadia");
        list1.add("Soli");

        list2.add("Nadia");
        list2.add("Soli");


        List<Boolean> result=new ArrayList<>();
        CompareGeneric compareGeneric=new CompareGeneric();
        result=compareGeneric.compare(list1,list2);
        if (result.contains(false))
        {
            System.out.println("Not Equal");
        }
        else {
            System.out.println("Equal");
        }

    }


}
