package cases;

public class StringInternTest { 
public static void main(String[] args) { 
// 使用char数组来初始化a，避免在a被创建之前字符串池中已经存在了值为"abcd"的对象 
String a = new String(new char[] { 'a', 'b', 'c', 'd' }); //在堆中创建对象，并把它的引用赋值给a
String b = a.intern(); //在字符串中创建对象“abcd”,并把它的引用赋值给b
if (b == a) { 
System.out.println("b被加入了字符串池中，没有新建对象"); 
} else { 
System.out.println("b没被加入字符串池中，新建了对象"); 
} 
} //显然a和b不是同一个对象
} 

//只有使用引号包含文本的方式创建的String对象之间使用“+”连接产生的新对象才会被加入字符串池中。对于所有包含new方式新建对象（包括null）的“+”连接表达式，它所产生的新对象都不会被加入字符串池中，对此我们不再赘述。因此我们提倡大家用引号包含文本的方式来创建String对象以提高效率
//如果比较的是两个基本类型（char，byte，short，int，long，float，double，boolean），则是判断它们的值是否相等。 
//如果表较的是两个对象变量，则是判断它们的引用是否指向同一个对象。


/*String a="ab"+"cd"; 

"ab"和"cd"分别创建了一个对象，它们经过“+”连接后又创建了一个对象"abcd"，因此一共三个，并且它们都被保存在字符串池里了。 
*/


//在JAVA虚拟机（JVM）中存在着一个字符串池，其中保存着很多String对象，并且可以被共享使用，因此它提高了效率。由于String类是final的，它的值一经创建就不可改变，因此我们不用担心String对象共享而带来程序的混乱。字符串池由String类维护，我们可以调用intern()方法来访问字符串池。 
