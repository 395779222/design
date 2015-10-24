package com.oz.stratery;

public class LYXZ {
	
	public static void main(String[] args) {
		 Context context;  
		 
		 System.out.println("网络故障迷茫哥在我们玩站买票出票失败了");  
		 context = new Context(new NetError());
		 context.operate();
		 
		 System.out.println("数据库故障销魂哥在我们玩站买票出票失败了");  
		 context = new Context(new DatabaseError());
		 context.operate();
	}
	
}
