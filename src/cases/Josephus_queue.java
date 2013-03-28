package cases;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Li,Gen
 */
public class Josephus_queue {

	/**
	 * 约瑟夫环是一个数学的应用问题：已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围。 从编号为k的人开始报数，数到m的那个人出列； 他的下一个人又从1开始报数，数到m的那个人又出列；依此规律重复下去，
	 * 直到圆桌周围的人全部出列。
	 */

	public static void main(String[] args) {
		
		String[] kids =  {"6","4","5","2","3","1"};
		

		System.out.println("最后退出的是" + Josephus(createQueue(kids),3));
	}

	public static Object Josephus(Queue<Object> q, int k) {
		/*if (q.isEmpty()) {
			return null;
		}*/
		while (q.size() > 1) {
			//q.iterator();
			for (int i = 1; i < k; i++) {
				q.add(q.remove());   //remove把队首的元素移动队尾
			}
			Object e = q.remove();   //把队首的元素删除，并返回队首元素
			System.out.println(e + "退出");
			

		}
		return q.poll(); //最后剩下的一个元素
	}
	
	//将一组对象组织为一个队列
	@SuppressWarnings("serial")
	public static Queue<Object> createQueue(Object[] a){
		Queue<Object> q = new ConcurrentLinkedQueue<Object>() {};
		for(int i = 0;i<a.length ;i++){
			q.add(a[i]);
		}
		return q;
	}
}
