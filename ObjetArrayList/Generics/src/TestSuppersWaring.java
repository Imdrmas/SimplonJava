import java.util.ArrayList;
import java.util.List;
@SuppressWarings("unchecked")
public class TestSuppersWaring {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List donnes = new ArrayList();
		donnes.add("Value1");
		System.out.println(donnes);
		
		

	}

}
