package cases.puzzlers.chapter4;

public class Count {
    public static void main(String[] args) {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++){
            count++;
        }
        System.out.println(count);
    }
}
//float的精度为24位。
//int 2000000000 二进制31位。
//50 二进制  32+ 16 +2  110010 六位，舍弃
//2000000000 和 2000000050的float表示是相同的。

//int 2^31-1 = 2147483647