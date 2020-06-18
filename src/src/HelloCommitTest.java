import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloCommitTest {

	//&begin(FeatureTestScenario1)
	@Test
	void test1() {
		HelloCommit hello = new HelloCommit();
		boolean retVal = hello.runTestScenario1(4);
		assertEquals(retVal, true); 
	}
	
	@Test
	void test2() {
		HelloCommit hello = new HelloCommit();
		boolean retVal = hello.runTestScenario1(0);
		assertEquals(retVal, true); 
	}
	//&end(FeatureTestScenario1)
	
}
