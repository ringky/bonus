package cases;


/**
 * ����ϵͳ����������⡣����ϵͳ�����Ϊϵͳ������û��������֡����У�ϵͳ��������ȼ� < 50���û���������ȼ� >= 50�� <=
 * 255�����ȼ�����255��Ϊ�Ƿ�����Ӧ�����޳�������һ�������task[]������Ϊn��task�е�Ԫ��ֵ��ʾ��������ȼ�����ֵԽС�����ȼ�Խ�ߡ�����schedulerʵ�����¹��ܣ���task[]
 * �е�������ϵͳ�����û��������δ�ŵ� system_task[] ����� user_task[] �����У�������Ԫ�ص�ֵ��������task[]
 * �����е��±꣩���������ȼ��ߵ���������ǰ�棬���ȼ���ͬ�����������˳�����У�������ӵ���������ǰ�棩������Ԫ��Ϊ-1��ʾ������
 * */
public class TaskSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	void scheduler(int task[], int n, int system_task[], int user_task[]) {
		//ѭ��task����ŵ���ͨ���͵�����������
		for(int i=0,j=0,k=0;i<= task.length;i++){
			if(task[i] < 50){
				system_task[j++] = i;
			}
			else if(task[j] >=50 && task[i] <=255){
				user_task[k++] = i;
			}
		}
		

	}
}
