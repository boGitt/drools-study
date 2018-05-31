package com.sample.step.a;

import com.sample.step.Condition;

public class ConditionA extends Condition {

	
	/*******自定义计算因子*******/
	
	private int param1 = 0;
	
	private int param2 = 0;
	
	private final int result = 6;

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}

	public int getParam2() {
		return param2;
	}

	public void setParam2(int param2) {
		this.param2 = param2;
	}
	
	public boolean getResult() {
		return param1 + param2 == result;
	}
	
	/*******自定义计算因子*******/


}
