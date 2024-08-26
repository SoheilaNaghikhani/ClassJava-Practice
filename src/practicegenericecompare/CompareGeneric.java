package src.practicegenericecompare;

import java.util.ArrayList;
import java.util.List;

public class CompareGeneric<T> {
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public List<Boolean> compare(List<T> list1, List<T> list2) {
        List<Boolean> result = new ArrayList<>();
        if (list1.size() != list2.size()) {
            result.add(false);
        } else {
            for (int i = 0; i < list1.size(); i++) {
                if (!(list1.get(i)).equals(list2.get(i))) {
                    result.add(false);
                    break;
                }
                result.add(true);
            }
        }
        return result;
    }
}
