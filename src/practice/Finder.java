package practice;

import java.util.ArrayList;

public class Finder {

	public Object lastIndexOf(ArrayList<String> arrayList, String string) {
		// TODO Auto-generated method stub
		String lowerCase = string.toLowerCase();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).toLowerCase().equals(lowerCase) && arrayList.get(i+1).toLowerCase().equals(lowerCase)) {
				return 2;
			}
				
			
			if(arrayList.get(i).toLowerCase().equals(lowerCase)) {
				
				
				return i;	
			}
			
			
			
			}
	
return -1;
	}
}