public class HelloPartial {

    public void main(String[] args) {
        System.out.println("Make prints in different methods to simulate partial commits.");
        methodA();
    }

    //&begin(FeatureA)
    private void methodA(){
		System.out.println("New Method here1");
		System.out.println("New Method here2");
		System.out.println("New Method here3");
		System.out.println("New Method here4");
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
    	return i*j;
    }
    //&end(FeatureTestScenario2)
    
	//&begin(FeatureA)
	private void methodC1(){
        System.out.println("methodC");
    }
	//&end(FeatureA)
}
