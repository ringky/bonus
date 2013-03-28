package cases.puzzlers.chapter2;

public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);
      // double i =  Math.pow(2, 16) - 1;
    }
}
//int -> byte -> char - >int
//-1  -> -1 -> Math.pow(2, 16) - 1 ->Math.pow(2, 16) - 1
//    （符号扩展）拓宽基本类型  -> 拓宽并窄化基本类型 byte转化为int,int再转化为char ->零扩展
//从较窄的基本类型转化为较宽的类型的行为：
//如果最初的数是又符号的，则进行符号扩展，如果最初的数是char类型的，则不管后面的类型是
//何种类型都执行零扩展。
