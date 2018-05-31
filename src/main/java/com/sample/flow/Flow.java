package com.sample.flow;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public abstract class Flow {
	
	//kie
	protected KieServices kieServices;
	
    protected KieContainer kieContainer;

    public Flow() {
        kieServices = KieServices.Factory.get();
        kieContainer = kieServices.getKieClasspathContainer();
    }
    
    protected String ruleName;
    
    protected KieSession kieSession ;
    
    public abstract void show() ;
}
