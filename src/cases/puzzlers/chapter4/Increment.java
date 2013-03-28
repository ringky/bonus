package cases.puzzlers.chapter4;
public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++){
            j = j++;//j++的值等于j在执行增量操作之前的初始值。该行可改为j++
        }
        System.out.println(j);
    }
}
//j=j++ 等价于
//int tmp = j
//j = j + 1
//j = tmp


