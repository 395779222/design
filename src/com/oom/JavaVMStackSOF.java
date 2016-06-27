/**   
* @Title: JavaVMStackSOF.java
* @Package com.oom
* @Description: TODO(用一句话描述该文件做什么)
* @author huxiangu
* @date 2016年6月13日 下午3:25:23
* @version V1.0   
*/


package com.oom;

/**
* @ClassName: JavaVMStackSOF
* @Description: TODO(这里用一句话描述这个类的作用)
* @author huxiangyu
* @date 2016年6月13日 下午3:25:23
* 
*/
/*
 * java虚拟机栈是线程私有的每个方法执行的时候会创建栈帧，用于存储局部变量，操作数栈，每个方法的执行都是入栈到出栈的过程
 * 栈容量由-Xss设定
 * */
public class JavaVMStackSOF {
	private int stackLength = 1;

	public void stackLeak(){
		stackLength++;
		stackLeak();
	}
	
	public static void main(String[] args) throws Throwable{
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try{
			oom.stackLeak();
		}catch(Exception e){
			System.out.println("stack length:"+oom.stackLength);
			throw e;
		}
	}
/*Exception in thread "main" java.lang.StackOverflowError
	at com.oom.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:26)*/
}
