package com.algorithm.binaryTree;

public class BinaryTree<T> {
	//根节点
	Node<T> rootNode;
	//节点总数
	int num;
	//深度
	int deep;
	
	public Node<T> getRootNode() {
		return rootNode;
	}
	public void setRootNode(Node<T> rootNode) {
		this.rootNode = rootNode;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDeep() {
		return deep;
	}
	public void setDeep(int deep) {
		this.deep = deep;
	}
}
