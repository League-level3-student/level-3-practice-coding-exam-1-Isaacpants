package practice;

import java.util.HashMap;

public class FishingContest {
	HashMap<String, double[]> allCatches;
int index = 0;
double[] temp;
double maxVal;
	public FishingContest(HashMap<String, double[]> allCatches) {
		// TODO Auto-generated constructor stub
		this.allCatches = allCatches;

	}

	public double findBiggestFish(String string) {
		
		
//		double [] temp2 = allCatches.get(string);
//		if(temp2.length == 0) return 0;
//		double maxVal = 0;
//		for(int index = 0; index < temp2.length; index++) {
//			if(maxVal < temp2[index]) {
//				maxVal = temp2[index];
//			}
//			
//		}
//		return maxVal;
		
		 temp = allCatches.get(string);
		if(temp.length == 0) return 0;
		 maxVal =0;
		for(int i = 0; i < temp.length; i++) {
		if(maxVal < temp[i]) {
			maxVal = temp[i];
			index = i;
		}
		}
		return maxVal;
		
		
		}
//return maxVal;

	public Object findWinner() {
		double[] temp1=allCatches.get("john");
		double[] temp2 = allCatches.get("esme");
		maxVal = findBiggestFish("john");
		for (int i = 0; i < temp1.length; i++) {
			if(temp1[i]==maxVal && i==index) {
				return "john";
			}
		}for (int i = 0; i < temp2.length; i++) {
			if(temp1[i]==maxVal && i==index) {
				return "john";
			}
		}
		
		// TODO Auto-generated method stub
		return null;
	}
	}
