package com.sea.pattern.composite;

/**
 * 
 * Ҷ�ӽڵ�
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("Ҷ�ӽڵ㲻����ӽڵ�");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Ҷ�ӽڵ㲻��ɾ���ڵ�");
	}

	@Override
	public void display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(getName());
	}

}
