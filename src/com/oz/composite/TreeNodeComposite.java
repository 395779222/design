package com.oz.composite;


import java.util.Enumeration;
import java.util.Vector;


/*
 * 这里的 TreeNode 的
 * */
public class TreeNodeComposite extends Component{
	//节点名称
	private String name;
	//直接父类节点
	private TreeNodeComposite parent;
	
	private Vector<TreeNodeComposite> children = new Vector<TreeNodeComposite>();

	public TreeNodeComposite(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNodeComposite getParent() {
		return parent;
	}

	public void setParent(TreeNodeComposite parent) {
		this.parent = parent;
	}

	/**
	 * 添加子节点
	 * 
	 * @param node
	 */
	public void addChildren(TreeNodeComposite node) {
		children.add(node);
		node.setParent(this);
	}

	/**
	 * 删除子节点
	 * 
	 * @param node
	 */
	public void removeChildren(TreeNodeComposite node) {
		children.remove(node);
	}

	/**
	 * 获得子节点
	 * 
	 * @return
	 */
	public Enumeration<TreeNodeComposite> getChildren() {
		return children.elements();
	}

	@Override
	public String toString() {
		return "TreeNode [parent=" + (null == parent ? "" : parent.getName()) +
			", name=" + name
				+ ", children" + children.toString() + "]";
	}

	public void show() {
		for(TreeNodeComposite node:children){
			node.show();
		}
		
	}
	
}