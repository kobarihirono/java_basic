package 黒本.chap13.Q4;

import java.util.ArrayList;
import java.util.List;

public class Trash {
    List<String> list = new ArrayList<>();
    protected Trash(String val) {
        add(val);
    }

    public boolean test(String val) {
        return true;
    }

    public void delete(String val) {
        list.remove(val);
    }

    public final void add(String val) {
        list.add(val);
    }
}
