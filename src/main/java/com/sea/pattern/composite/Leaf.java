package com.sea.pattern.composite;

/**
 * 
 * 叶子节点
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("叶子节点不能添加节点");
	}

	@Override
	public void remove(Component component) {
		System.out.println("叶子节点不能删除节点");
	}

	@Override
	public void display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(getName());
	}

}
