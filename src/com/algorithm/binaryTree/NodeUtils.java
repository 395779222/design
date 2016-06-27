package com.algorithm.binaryTree;

public class NodeUtils {
	
	public BinaryTree<Student> generateTestTree(){
		BinaryTree<Student> tree = new BinaryTree<Student>();
		
		Student studentRoot = new Student();
		studentRoot.setId(0);
		studentRoot.setName("主席");
		Node<Student> rootNode = new Node<Student>();
		rootNode.setContent(studentRoot);
		tree.setRootNode(rootNode);
		
		Student studentLeftFu = new Student();
		studentLeftFu.setId(1);
		studentLeftFu.setName("我是左副主席");
		Node<Student> leftNodeLeve1 = new Node<Student>();
		leftNodeLeve1.setContent(studentLeftFu);
		rootNode.setLeftChild(leftNodeLeve1);
		
		Student studentrightFu = new Student();
		studentrightFu.setId(2);
		studentrightFu.setName("我是右副主席");
		Node<Student> rightNodeLeve1 = new Node<Student>();
		rightNodeLeve1.setContent(studentrightFu);
		rootNode.setRightChild(rightNodeLeve1);
		
		return tree;
	}
}
