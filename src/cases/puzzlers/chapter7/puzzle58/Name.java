package cases.puzzlers.chapter7.puzzle58;

import java.util.*;

/**
 * �κ�ʱ��д��equals����������ͬʱ��дhashCode()����
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
	
	//Ĭ������±�����ͬһ���������ȡ���д��ֻҪfirst,��last��Ⱦ�equal
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name n = (Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}

	//��ȵĶ����������ȵ�ɢ����
	public int hashCode() {
		return first.hashCode() + last.hashCode();
	}

	public static void main(String[] args) {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Donald", "Duck"));
		System.out.println(s.contains(new Name("Donald", "Duck")));
	}
}
