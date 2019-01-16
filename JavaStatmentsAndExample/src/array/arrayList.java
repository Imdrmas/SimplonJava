package array;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.List<String> nameList = new java.util.ArrayList<String>();
		nameList.add("Drmas");
		nameList.add("Ahmed");
		nameList.add("Issam");
		
		nameList.remove(0); //Removed
		nameList.set(0, "Amr"); //Added
		
		System.out.println(nameList.get(0));
		System.out.println(nameList.get(1));
		System.out.println(nameList);
		

	}

}
