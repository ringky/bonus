package cases.search;

import java.util.Arrays;

public class binary_search {

	/**
	 * @param args  二分查找是按升序排过序的
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
	
    //二分查找V0.1实现版  
    //copyright@2011 July  
    //随时欢迎读者找bug，email：zhoulei0907@yahoo.cn。  
      
    //首先要把握下面几个要点：  
    //right=n-1 => while(left <= right) => right=middle-1;  
    //right=n   => while(left <  right) => right=middle;  
    //middle的计算不能写在while循环外，否则无法得到更新。  
      
    static int binary_search1(int array[],int n,int value)  
    {  
        int left=0;  
        int right=n-1;  
        //如果这里是int right = n 的话，那么下面有两处地方需要修改，以保证一一对应：  
        //1、下面循环的条件则是while(left < right)  
        //2、循环内当array[middle]>value 的时候，right = mid  
      
        while (left<=right)          //循环条件，适时而变  
        {  
            int middle=left + ((right-left)>>1);  //防止溢出，移位也更高效。同时，每次循环都需要更新。  
      
            if (array[middle]>value)  
            {  
                right =middle-1;   //right赋值，适时而变  
            }   
            else if(array[middle]<value)  
            {  
                left=middle+1;  
            }  
            else  
                return middle;    
            //可能会有读者认为刚开始时就要判断相等，但毕竟数组中不相等的情况更多  
            //如果每次循环都判断一下是否相等，将耗费时间  
        }  
        return -1;  
    }  

}
