/**   
* @Title: HeapOOM.java
* @Package com.oom
* @Description: TODO(用一句话描述该文件做什么)
* @author huxiangu
* @date 2016年6月13日 上午10:34:18
* @version V1.0   
*/


package com.oom;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: HeapOOM
* @Description: TODO(这里用一句话描述这个类的作用)
* @author huxiangyu
* @date 2016年6月13日 上午10:34:18
* 
*/

/*
 * 堆内存溢出
 * 堆内存是所有线程共享区域，几乎所有对象的实例都会在这里分配内存
 * 因此不断的new对象显然会有溢出的时候
 *  -Xmx3550m：设置JVM最大可用内存为3550M。
	-Xms3550m：设置JVM促使内存为3550m。此值可以设置与-Xmx相同，以避免每次垃圾回收完成后JVM重新分配内存。
 * */
public class HeapOOM {
	static class OOMObject{
		
	}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
	
	public class Acca{
		
	} 
	/*Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		at java.util.Arrays.copyOf(Arrays.java:3210)
		at java.util.Arrays.copyOf(Arrays.java:3181)
		at java.util.ArrayList.grow(ArrayList.java:261)
		at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
		at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
	 * */
}
