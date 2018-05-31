package com.sample.flow.flow1;

import com.sample.flow.Flow;
import com.sample.step.a.StepA;
import com.sample.step.b.StepB;

public class Flow11 extends Flow {

	
	public void show() {
		
		StepA stepa = new StepA();
		stepa.getCondition().setParam1(3);
		stepa.getCondition().setParam2(3);
		
		StepB stepb = new StepB();
		
		kieSession = kieContainer.newKieSession("ksession-rules-flow1");
		kieSession.insert(stepa);
		kieSession.insert(stepb);
		kieSession.fireAllRules();
		
		
	}


}
