package com.sample.step.a;

import org.apache.commons.lang3.StringUtils;

import com.sample.step.Step;

public class StepA extends Step {


	public void execute() {
		// TODO Auto-generated method stub		
		System.out.println("StepA is executing!");
		
		if(!StringUtils.isEmpty(this.author))
			System.out.println("author is : " + this.author);
	}

	public StepA() {
		// TODO Auto-generated constructor stub
		condition = new ConditionA();
		priority = 101001021;
	}

	@Override
	public ConditionA getCondition() {
		// TODO Auto-generated method stub
		return (ConditionA) condition;
	}

	private String author = "";

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
