package com.sample.step;

public abstract class Step {

	//步骤执行条件
	protected Condition condition ;
	
	public abstract Condition getCondition() ;

	//步骤优先级别
	protected int priority;
	
	public int getPriority() {
		return priority;
	}

	//步骤执行任务,实现各环节业务代码
	public void execute() {
	};
	
}
