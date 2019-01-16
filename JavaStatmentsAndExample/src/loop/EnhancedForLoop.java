package loop;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Drmas");
		nameList.add("Issam");
		nameList.add("Ahmed");
		
		for(String str : nameList) {
			System.out.println(str);
		}
		
		int nums[] = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i : nums) {
			System.out.println(i);
		}

	}

}
