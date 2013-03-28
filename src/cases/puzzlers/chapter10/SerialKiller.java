package cases.puzzlers.chapter10;

import java.util.*;
import java.io.*;

public class SerialKiller {
    public static void main(String[] args) {
        Sub sub = new Sub(666); 
        sub.checkInvariant();

        Sub copy = (Sub) deepCopy(sub);
        copy.checkInvariant();
        System.out.println(copy.getId());
    }

    // Copies its argument via serialization (See Puzzle 83)
    static public Object deepCopy(Object obj) {
        try {
        	//Serialization
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            new ObjectOutputStream(bos).writeObject(obj);
            ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
            return new ObjectInputStream(bin).readObject(); 
        } catch(Exception e) {
            throw new IllegalArgumentException(e); 
        }
    }
}

class Super implements Serializable {
    final Set<Super> set = new HashSet<Super>();
} 

final class Sub extends Super {
    private int id;
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sub(int id) {
        this.id = id;
        set.add(this); // Establish invariant
    }

    public void checkInvariant() {
        if (!set.contains(this))
            throw new AssertionError("invariant violated");
    }
    

 private Object readResolve(){
    	
    	return new Sub(id);
    }

    
    
    public int hashCode() {
        return id;
    }

    public boolean equals(Object o) {
        return (o instanceof Sub) && (id == ((Sub)o).id);
    }
}
