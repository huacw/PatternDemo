package com.sea.pattern.state;

/**
 * 
 * 上下文对象
 *
 * @author huachengwu (mailto:huachengwu@tansun.com.cn)
 */
public class Context {
	private State state;
	private boolean finished;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public Context(State state) {
		super();
		this.state = state;
	}

	public void next() {
		if (state != null) {
			state.handle(this);
		}
	}
}
