package cases;

/**
 * @author Li,Gen
 */
public class Josephus {

	/**
	 * 约瑟夫环是一个数学的应用问题：已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围。
	 *  从编号为k的人开始报数，数到m的那个人出列；
	 *  他的下一个人又从1开始报数，数到m的那个人又出列；依此规律重复下去，
	 *  直到圆桌周围的人全部出列。
	 */

	private static class Node {//内部类  高内聚，低耦合

		public int no;

		public Node next;

		public Node(int no) {

			this.no = no;
		}

	}

	public static void main(String[] args) {
		System.out.println("出列的顺序为：");
		jos(7,2,1);
		
	}

	/**
	 * @param totalNum 总人数
	 * @param beginNo 开始数数的人的序号
	 * @param circleNum 数的数
	 * @return
	 */
	static void  jos(int totalNum,int circleNum,int beginNo){
		
		/*1,2,3,4,5,6,7*/
		if(beginNo > totalNum){
			System.out.println("没有编号为" + beginNo + "的人" );
			System.exit(0);
		}
		
		/*初始化环形链表开始*/
		Node header = new Node(beginNo);
		Node pointer = header;
		
		for (int i = 1;i< totalNum;i++){
			pointer.next = new Node(beginNo+i);
			pointer = pointer.next;
		}
		
		pointer.next = header;
		/*初始化链表结束*/
		
		
		/*不止一个元素*/
		while(pointer != pointer.next){
			for(int i =1;i<circleNum;i++){
				pointer = pointer.next;
			}
			System.out.println(pointer.next.no);
			pointer.next = pointer.next.next;  //出列的人后面的人补上他的位置。
			
		}
		
		/*剩下一个元素  pointer == pointer.next*/ 
		System.out.println(pointer.no);
		
		
	}
}
