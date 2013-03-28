package cases.search;

import java.util.Arrays;

public class binary_search {

	/**
	 * @param args  ���ֲ����ǰ������Ź����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] search =  { 2, 23, 53, 64, 158, 221, 260, 278, 651, 1564, 2355 ,36};
		Arrays.sort(search);
		/*for(int i=0;i<search.length;i++){
			System.out.println(search[i]);
		}*/

		System.out.println(binary_search1(search,12,36));
	}
	
    //���ֲ���V0.1ʵ�ְ�  
    //copyright@2011 July  
    //��ʱ��ӭ������bug��email��zhoulei0907@yahoo.cn��  
      
    //����Ҫ�������漸��Ҫ�㣺  
    //right=n-1 => while(left <= right) => right=middle-1;  
    //right=n   => while(left <  right) => right=middle;  
    //middle�ļ��㲻��д��whileѭ���⣬�����޷��õ����¡�  
      
    static int binary_search1(int array[],int n,int value)  
    {  
        int left=0;  
        int right=n-1;  
        //���������int right = n �Ļ�����ô�����������ط���Ҫ�޸ģ��Ա�֤һһ��Ӧ��  
        //1������ѭ������������while(left < right)  
        //2��ѭ���ڵ�array[middle]>value ��ʱ��right = mid  
      
        while (left<=right)          //ѭ����������ʱ����  
        {  
            int middle=left + ((right-left)>>1);  //��ֹ�������λҲ����Ч��ͬʱ��ÿ��ѭ������Ҫ���¡�  
      
            if (array[middle]>value)  
            {  
                right =middle-1;   //right��ֵ����ʱ����  
            }   
            else if(array[middle]<value)  
            {  
                left=middle+1;  
            }  
            else  
                return middle;    
            //���ܻ��ж�����Ϊ�տ�ʼʱ��Ҫ�ж���ȣ����Ͼ������в���ȵ��������  
            //���ÿ��ѭ�����ж�һ���Ƿ���ȣ����ķ�ʱ��  
        }  
        return -1;  
    }  

}
