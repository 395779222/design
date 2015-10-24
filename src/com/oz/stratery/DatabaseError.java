package com.oz.stratery;

public class DatabaseError implements Strategy{

	public void dealSoldTickeFaild() {
		
		System.out.println("数据库故障了，正在通知DBA");
		
		System.out.println("数据库故障了售票失败了，正在告知用户，进行退款");
		
		System.out.println("数据库故障了售票失败了，等待数据库修护好，更新数据库");
	}

}
