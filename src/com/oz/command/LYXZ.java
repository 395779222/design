package com.oz.command;

public class LYXZ {
	/*
	 * 命令模式主要优点在于： 我们只需要 把命令传出去，具体的细节不需要关心，使得命令发出，与执行要分开
	 * */
	public static void main(String[] args) {
		Man man = new Man();
		Command sexCommand = new SexCommand(man);
		System.out.println("看见了性感女神");
		Esoterica esoterica = new Esoterica();
		esoterica.setCommand(sexCommand);
		esoterica.execute();
		
		Command beautifulCommand = new BeautifulCommand(man);
		System.out.println("看见了传统漂亮女神");
		esoterica.setCommand(beautifulCommand);
		esoterica.execute();
		
		/*
		 * 向性感女神示爱
		         向标准女神示爱
		 * */
		
	}
}
