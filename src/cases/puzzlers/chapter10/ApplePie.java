package cases.puzzlers.chapter10;

public class ApplePie {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) ;{//多个分号
            count++;
        }
        System.out.println(count);
    }
}

//chapter4
 class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++){
            j = j++;//j++的值等于j在执行增量操作之前的初始值。该行可改为j++
        }
        System.out.println(j);
    }
}