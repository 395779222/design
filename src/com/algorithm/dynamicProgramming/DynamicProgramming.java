package com.algorithm.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DynamicProgramming {
	/**
	 * 动态规划 01背包问题
	 * 假设有一个重量为 totalWeight 的背包
	 * 现有物品a1,a2,....an,他们的重量为w1,w2,w3....wn 价值为v1,v2,v3....vn.（w1+w2+w3....>totalWeight）
	 * 请问如何将物品放入背包中才能让物品价值最大化
	 * 可以肯定的是要将这n个中的物品选择其中 m个放入背包
	 * 那么那些要放那些不要放呢？
	 * 
	 * 可以想象一下场景
	 * 1.若放的下一个物品大于totalWeight
	 * 	2.1 若是wm>currentWeight那么显然就是
	 *    当 wm>currentWeight  V(m-1,currentWeight)=V(m,currentWeight) 
	 *  
	 *  2.2 若是currentWeight>wm那么就比较复杂了这里的话可以直接判断出第m个能否成为最优解的一员
	 *  即V(m,currentWeight)=max{V(m-1,currentWeight) ,V(m-1,currentWeight-wm)+vm } 
	 */
	
	public static void main(String[] args) {
		List<Zone>allList = new ArrayList<Zone>();
		for(int i=0;i<10;i++){
			Zone zone = new Zone();
			zone.setId(i);
			zone.setWeight(getRandome(10,5));
			zone.setValue(getRandome(20,10));
			System.out.println("第"+i+"物品重量为："+zone.getWeight()+"价值为："+zone.getValue());
			allList.add(zone);
		}
		int sumValue = 0;
		int sumWeight = 0;
		ZuiYouJie zuiYouJie = new ZuiYouJie(50,allList);
		zuiYouJie.getZuiYou();
		for(int i=0;i<allList.size();i++){
			Zone zone = allList.get(i);
			if(allList.get(i).isForZuiYou){
				System.out.println("最优解 第"+zone.getId()+"物品重量为："+zone.getWeight()+"价值为："+zone.getValue());
				sumValue += zone.getValue();
				sumWeight += zone.getWeight();
			}
		}
		System.out.println("最优解总价值："+sumValue);
		System.out.println("最优解总重量："+sumWeight);
	}
	
	public static int getRandome(int max,int min){
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s;
	}
}
