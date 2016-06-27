package com.algorithm.binaryTree;

import java.util.List;

class Node <T>{
	
	Node<T> parentNode;
	List<Node<T>>childNodes;
	Node<T> leftChild;
	Node<T> rightChild;
	int num;
	T content;
	
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
	public Node<T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Node<T> getParentNode() {
		return parentNode;
	}
	public void setParentNode(Node<T> parentNode) {
		this.parentNode = parentNode;
	}
	public List<Node<T>> getChildNodes() {
		return childNodes;
	}
	public void setChildNodes(List<Node<T>> childNodes) {
		this.childNodes = childNodes;
	}
}
