package com.algorithm;



public class BinarySearch {
	
	/**
	 * 二分搜索 每次取中间的值与待查找的值比较
	 * 时间复杂度 
	 * @param toSearch 待查找的数
	 * @param allNum 查找的列表
	 * @return
	 */
	public static int getIndex(int toSearchNum,int allNum[]){
		//每次查找的开始位置（以0开始）
		int beginIndex = 0;
		//每次查找的结束为止
		int endIndex = allNum.length-1;
		while(beginIndex<=endIndex){
			//取到中间位置
			int middleIndex =( beginIndex+endIndex)/2;
			if(toSearchNum==allNum[middleIndex]){
				return middleIndex;
			}else if(toSearchNum<allNum[middleIndex]){
				endIndex = middleIndex-1;
			}else{
				beginIndex = middleIndex+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] allNum = {1,2,3,5,8,9,20,23,45};
		int index = BinarySearch.getIndex(9,allNum);
		System.out.println("查找3的位置为："+index);
		/* 时间复杂度的计算 假设一共循环调用k次，总的数量为n
		 * 那么我们循环的规律是 n/2,n/4,n/8........n/(2的K次方)执行单最后n/(2的 K次方)=1
		 * 那么k=log2n =>时间复杂度o(log2n)
		 * */
	}
	
}
