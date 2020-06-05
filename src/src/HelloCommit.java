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
        System.out.println("commitC");
    }
	//&end(FeatureA)

    private void commitE(){
		//&begin(FeatureC)
        System.out.println("commitE");
		System.out.println("commitE1");
		//&end(FeatureC)
    }
}
