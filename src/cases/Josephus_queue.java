package cases;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Li,Gen
 */
public class Josephus_queue {

	/**
	 * Լɪ����һ����ѧ��Ӧ�����⣺��֪n���ˣ��Ա��1��2��3...n�ֱ��ʾ��Χ����һ��Բ����Χ�� �ӱ��Ϊk���˿�ʼ����������m���Ǹ��˳��У� ������һ�����ִ�1��ʼ����������m���Ǹ����ֳ��У����˹����ظ���ȥ��
	 * ֱ��Բ����Χ����ȫ�����С�
	 */

	public static void main(String[] args) {
		
		String[] kids =  {"6","4","5","2","3","1"};
		

		System.out.println("����˳�����" + Josephus(createQueue(kids),3));
	}

	public static Object Josephus(Queue<Object> q, int k) {
		/*if (q.isEmpty()) {
			return null;
		}*/
		while (q.size() > 1) {
			//q.iterator();
			for (int i = 1; i < k; i++) {
				q.add(q.remove());   //remove�Ѷ��׵�Ԫ���ƶ���β
			}
			Object e = q.remove();   //�Ѷ��׵�Ԫ��ɾ���������ض���Ԫ��
			System.out.println(e + "�˳�");
			

		}
		return q.poll(); //���ʣ�µ�һ��Ԫ��
	}
	
	//��һ�������֯Ϊһ������
	@SuppressWarnings("serial")
	public static Queue<Object> createQueue(Object[] a){
		Queue<Object> q = new ConcurrentLinkedQueue<Object>() {};
		for(int i = 0;i<a.length ;i++){
			q.add(a[i]);
		}
		return q;
	}
}
