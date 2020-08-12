public class HelloCommit {

    private void commitA(){
        System.out.println("commitA");
		System.out.println("functionA2");	//&line(FeatureC)
    }

    private void commitB(){
        System.out.println("commitB");
    }

	//&begin(FeatureA)
    private void commitC(){
        System.out.println("FeatureA - commitC");
    }
	//&end(FeatureA)

    private void commitE(){
		//&begin(FeatureC)
        System.out.println("commitE");
		System.out.println("commitE1");
		//&end(FeatureC)
    }
    
    //&begin(FeatureTestScenario1)
    protected boolean runTestScenario1(int i) {
    	System.out.println("Run runTestScenario1 with i=" +i);
    	
    	if(i==0) {
    		return true;
    	}
    	
    	commitC();
    	 
    	if(i%2==0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    //&end(FeatureTestScenario1)
}
