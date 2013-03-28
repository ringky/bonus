package cases;

/**
 * @author Li,Gen
 */
public class Josephus {

	/**
	 * Լɪ����һ����ѧ��Ӧ�����⣺��֪n���ˣ��Ա��1��2��3...n�ֱ��ʾ��Χ����һ��Բ����Χ��
	 *  �ӱ��Ϊk���˿�ʼ����������m���Ǹ��˳��У�
	 *  ������һ�����ִ�1��ʼ����������m���Ǹ����ֳ��У����˹����ظ���ȥ��
	 *  ֱ��Բ����Χ����ȫ�����С�
	 */

	private static class Node {//�ڲ���  ���ھۣ������

		public int no;

		public Node next;

		public Node(int no) {

			this.no = no;
		}

	}

	public static void main(String[] args) {
		System.out.println("���е�˳��Ϊ��");
		jos(7,2,1);
		
	}

	/**
	 * @param totalNum ������
	 * @param beginNo ��ʼ�������˵����
	 * @param circleNum ������
	 * @return
	 */
	static void  jos(int totalNum,int circleNum,int beginNo){
		
		/*1,2,3,4,5,6,7*/
		if(beginNo > totalNum){
			System.out.println("û�б��Ϊ" + beginNo + "����" );
			System.exit(0);
		}
		
		/*��ʼ����������ʼ*/
		Node header = new Node(beginNo);
		Node pointer = header;
		
		for (int i = 1;i< totalNum;i++){
			pointer.next = new Node(beginNo+i);
			pointer = pointer.next;
		}
		
		pointer.next = header;
		/*��ʼ���������*/
		
		
		/*��ֹһ��Ԫ��*/
		while(pointer != pointer.next){
			for(int i =1;i<circleNum;i++){
				pointer = pointer.next;
			}
			System.out.println(pointer.next.no);
			pointer.next = pointer.next.next;  //���е��˺�����˲�������λ�á�
			
		}
		
		/*ʣ��һ��Ԫ��  pointer == pointer.next*/ 
		System.out.println(pointer.no);
		
		
	}
}
