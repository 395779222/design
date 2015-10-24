package com.oz.bridge;

/*
 * 抽象化诗人 诗人写诗，需要具体的行为配置才可以进行写诗，吟诗等行为 这样诗诗人，与其写诗等行为分开
 * 对象与行为的分离，就像spring 中很多都有类似的思路,spring 加载bean的时候，
 * 1.配置文件的加载，实例化beanfactory着历史一个复杂的过程，2.getBaen()
 * 这样factoryBean 与其行为getBean()也就实现了分离
 * */
public abstract class AbstractPoet {
	
    private AbstractPoetAction poetAction;  
    
	public  void writePoem(){
		poetAction.wirte();
	}
	
	public AbstractPoetAction getPoetAction() {
		return poetAction;
	}
	
	public void setPoetAction(AbstractPoetAction poetAction) {
		this.poetAction = poetAction;
	}
	
	
}
