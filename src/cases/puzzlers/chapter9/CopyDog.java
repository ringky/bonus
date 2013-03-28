package cases.puzzlers.chapter9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * �����лᴴ��һ�����صĹ�������readResolve�Ὣ���صĹ�����ת��Ϊ���صľ�̬�������Է���ԭ��
 * ���Ǹ�Dog
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
 

