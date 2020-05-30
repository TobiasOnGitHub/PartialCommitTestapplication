public class HelloPartial {

    public void main(String[] args) {
        System.out.println("Make prints in different methods to simulate partial commits.");
        methodA();
    }

    //&begin(FeatureA)
    private void methodA(){
        System.out.println("methodA2");
		System.out.println("New Method here - more changes");
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
    }
}
