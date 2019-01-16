package array;


public class ClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = new String[6];
		names[0] = "ahmed";
		names[1] = "amr";
		
		for(int x =0; x < names.length; x++) {
			System.out.println(names[x]);
		}
		
		int nums[] = new int[5];
		nums[0] = 100;
		nums[1] = 90;
		
		for(int x = 0; x < nums.length; x++) {
			System.out.println(nums[x]);
		}

	}

}
