
public class HelloFeature {

	public static void main(String[] args) {
		int res1 = plus(1,2);
		double res2 = multi(5,3);
	}
	
	//&begin[FeatureTestScenario3]
	private static int plus(int i, int j) {
		int tmp1 = i;
		int tmp2 = j;
		int tmp = tmp1 + tmp2;
		return tmp;
	}
	//&end[FeatureTestScenario3]
	
	//&begin[FeatureTestScenario4]
	private static int minus(int i, int j) {
		int temp = 0;
		temp = i-j;
		return temp;
	}
	//&end[FeatureTestScenario4]
	
	//&begin[FeatureTestScenario3]
	private static double multi(double x, double y) {
		if(y==0) {
			return x*0;
		} else if (y==1) {
			return x*1;
		} else if (y==2) {
			x += Math.random()*2; //&line[FeatureTestScenario4]
			return x*2;
		} else if (y==3) {
			return x*3;
		} else {
			return -1;
		}
	}
	//&end[FeatureTestScenario3]
	
}
