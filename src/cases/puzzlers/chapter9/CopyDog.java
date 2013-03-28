package cases.puzzlers.chapter9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 解序列会创建一个隐藏的构造器。readResolve会将隐藏的构造器转变为隐藏的静态工厂，以返回原来
 * 的那个Dog
 * 
 * 
 *
 */
public class CopyDog {
    public static void main(String[] args) {
        Dog newDog = (Dog)deepCopy(Dog.INSTANCE); // You figure out what to put here

        // This line should print false
        System.out.println(newDog == Dog.INSTANCE);

        // This line should print "Woof"
        System.out.println(newDog);
    }
    
    //this method is very slow and generally a bad ideal
    public static Object deepCopy (Object obj){
    	try{
    		ByteArrayOutputStream bos = new ByteArrayOutputStream();
    		new ObjectOutputStream(bos).writeObject(obj);
    		
    		ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
    		return new ObjectInputStream(bin).readObject();
    	}catch(Exception e){
    		throw new IllegalArgumentException(e);
    		
    	}
    	
    }
}
 

