import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest {
    int i;
    public static void main(String args[]) {
    	
        ArrayList<ArrayTest> test = new ArrayList<ArrayTest>();
        ArrayTest obj;
        obj = new ArrayTest(1);
        test.add(obj);
        obj = new ArrayTest(2);
        test.add(obj);
        obj = new ArrayTest(3);
        test.add(obj);
        
        System.out.println("Before removing size is " + test.size() + " And Element are : " + test);
        
        Iterator<ArrayTest> itr = test.iterator();
        while (itr.hasNext()) {
            ArrayTest number = itr.next();
            if (number.i == 1) {
                itr.remove();
            }
        }
        System.out.println("After removing size is " + test.size() + " And Element are :" + test);
    }
    public ArrayTest(int i) {
        this.i = i;
    }
    @Override
    public String toString() {
        return "ArrayTest [i=" + i + "]";
    }

}