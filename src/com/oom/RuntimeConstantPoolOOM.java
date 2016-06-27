/**   
* @Title: RuntimeConstantPoolOOM.java
* @Package com.oom
* @Description: TODO(用一句话描述该文件做什么)
* @author huxiangu
* @date 2016年6月14日 下午7:32:16
* @version V1.0   
*/


package com.oom;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: RuntimeConstantPoolOOM
* @Description: TODO(这里用一句话描述这个类的作用)
* @author huxiangyu
* @date 2016年6月14日 下午7:32:16
* 
*/

public class RuntimeConstantPoolOOM {
	//String.intern()作用是如果字符串常量池中已近包含一个等于次String的对象字符串，则返回否则将字符串添加到常量池中
	//因此该方法会出现运行时常量池异常(PermGen space)
	 //-XX:PermSize 和 -XX:MaxPermSize
	public static void main (String[] args){
		List<String > list = new ArrayList<String>();
		int i = 0;
		while(true){
			list.add(String.valueOf(i++).intern());
		}
	}
	
}
