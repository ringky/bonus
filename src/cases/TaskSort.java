package cases;


/**
 * 操作系统任务调度问题。操作系统任务分为系统任务和用户任务两种。其中，系统任务的优先级 < 50，用户任务的优先级 >= 50且 <=
 * 255。优先级大于255的为非法任务，应予以剔除。现有一任务队列task[]，长度为n，task中的元素值表示任务的优先级，数值越小，优先级越高。函数scheduler实现如下功能，将task[]
 * 中的任务按照系统任务、用户任务依次存放到 system_task[] 数组和 user_task[] 数组中（数组中元素的值是任务在task[]
 * 数组中的下标），并且优先级高的任务排在前面，优先级相同的任务按照入队顺序排列（即先入队的任务排在前面），数组元素为-1表示结束。
 * */
public class TaskSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	void scheduler(int task[], int n, int system_task[], int user_task[]) {
		//循环task数组放到不通类型的任务数组中
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
