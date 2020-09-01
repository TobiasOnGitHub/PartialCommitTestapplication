public class HelloPartial {

    //&begin(FeatureA)
    private void methodA(){
		System.out.println("New Method here1");
		System.out.println("New Method here2");
		System.out.println("New Method here3");
    }
    //&end(FeatureA)
    
    private void methodB(){
        System.out.println("methodB");
    }

    private void methodC(){
        System.out.println("methodC");
    }


    private void methodE(){
        System.out.println("methodE");
		System.out.println("methodE2");
		System.out.println("methodE3");
    }
	
    //&begin(FeatureTestScenario2)
    protected int runTestScenario2(int i, int j) {
    	System.out.println("Run runTestScenario1 with i=" +i +" j=" +j);
    	if(i==0||j==0) {
    		return 0;
    	}
    	return i*j;
    }
    //&end(FeatureTestScenario2)
    
	//&begin(FeatureA)
	private void methodC1(){
        System.out.println("methodC");
    }
	//&end(FeatureA)
}
