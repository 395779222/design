/**   
* @Title: UnsafeSequence.java
* @Package com.thread.demo.capter1
* @Description: TODO(用一句话描述该文件做什么)
* @author huxiangu
* @date 2016年6月4日 下午1:53:37
* @version V1.0   
*/


package com.thread.demo.capter1;

/**
* @ClassName: UnsafeSequence
* @Description: TODO(这里用一句话描述这个类的作用)
* @author huxiangyu
* @date 2016年6月4日 下午1:53:37
* 
*/

public class UnsafeSequence {
	private int value;
	/*value++ 包含三个操作，读取value,value+1,将value+1赋值给value;
	 *  多个线程同时执行读取操作会导致获取同样的值。
	*/
	public int getValue() {
		return value++;
	}	
}
