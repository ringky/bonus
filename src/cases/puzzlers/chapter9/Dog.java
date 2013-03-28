package cases.puzzlers.chapter9;


/**
 * Dog扩展了Exception,而Exception实现了serializable
 * 
 * 
 *
 */
public class Dog extends Exception {
	private static final long serialVersionUID = -4019657923580256822L;
	public static final Dog INSTANCE = new Dog();
    private Dog() { }

    public String toString() {
        return "Woof";
    }
    private Object readResolve(){
    	
    	return INSTANCE;
    }
}
