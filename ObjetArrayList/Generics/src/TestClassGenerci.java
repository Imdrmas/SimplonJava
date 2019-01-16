
public class TestClassGenerci {

	public static void main(String[] args) {
		MaClassGenerics<Integer, String> mc = new MaClassGenerics<Integer, String>(1, " value 1");
		Integer param1 = mc.getParam1();
		String param2 = mc.getParam2();
		
		System.out.println(param1+param2);

	}

}
