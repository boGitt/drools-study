package com.sample.step.b;

import com.sample.step.Step;

public class StepB extends Step {


	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("StepB is executing!");
	}

	public StepB() {
		condition = new ConditionB();
		priority = 101001011;
	}

	@Override
	public ConditionB getCondition() {
		// TODO Auto-generated method stub
		return (ConditionB) condition;
	}
	
}
