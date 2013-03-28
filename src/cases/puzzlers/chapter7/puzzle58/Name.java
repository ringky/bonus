package cases.puzzlers.chapter7.puzzle58;

import java.util.*;

/**
 * 任何时候覆写了equals方法，必须同时覆写hashCode()方法
 * 
 * 
 *
 */
public class Name {
	private String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	
	public boolean equals(Name n) {
		return n.first.equals(first) && n.last.equals(last);
	}
	
	//默认情况下必须是同一个对象才相等。覆写后，只要first,和last相等就equal
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name n = (Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}

	//相等的对象必须有相等的散列码
	public int hashCode() {
		return first.hashCode() + last.hashCode();
	}

	public static void main(String[] args) {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Donald", "Duck"));
		System.out.println(s.contains(new Name("Donald", "Duck")));
	}
}
