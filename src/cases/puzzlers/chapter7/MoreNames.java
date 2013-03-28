package cases.puzzlers.chapter7;

import java.util.*;

public class MoreNames {
    private Map<String,String> m = new HashMap<String,String>();

    //void 声明方法而不是声明构造器
    public void MoreNames() {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }

    public int size() {
        return m.size();
    }

    public static void main(String args[]) {
        MoreNames moreNames = new MoreNames(); //自动产生的无参构造器
        System.out.println(moreNames.size());
    } 
}
