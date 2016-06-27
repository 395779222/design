/**   
* @Title: SafeSequence.java
* @Package com.thread.demo.capter1
* @Description: TODO(用一句话描述该文件做什么)
* @author huxiangu
* @date 2016年6月4日 下午2:00:18
* @version V1.0   
*/


package com.thread.demo.capter1;

import org.apache.http.annotation.GuardedBy;

/**
* @ClassName: SafeSequence
* @Description: TODO(这里用一句话描述这个类的作用)
* @author huxiangyu
* @date 2016年6月4日 下午2:00:18
* 
*/

public class SafeSequence {
	
	@GuardedBy ("this") private int value;
	
	public synchronized int getValue() {
		return value++;
	}	
}
