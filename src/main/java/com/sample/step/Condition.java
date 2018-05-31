package com.sample.step;

public abstract class Condition {

	//最终条件标志
	protected boolean flag = false;
	
	protected boolean getFlag() {
		return this.flag;
	}
	
	//条件标志集
	public static boolean FLAG_EXECUTE = true;
	public static boolean FLAG_SKIP = false;

}
