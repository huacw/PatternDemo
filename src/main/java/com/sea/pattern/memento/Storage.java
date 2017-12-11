package com.sea.pattern.memento;

/**
 * 
 * �洢����¼���ࣨ�����ߣ�
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Storage {
	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
