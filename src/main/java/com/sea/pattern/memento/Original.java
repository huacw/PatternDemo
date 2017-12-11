package com.sea.pattern.memento;

/**
 * 
 * 原始类（发起者）
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Original {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		super();
		this.value = value;
	}

	public Memento createMemento() {
		return new Memento(value);
	}

	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}

}
