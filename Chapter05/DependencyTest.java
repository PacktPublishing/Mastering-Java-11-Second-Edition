import sun.misc.BASE64Encoder;

public class DependencyTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		BASE64Encoder.class.newInstance();
		
		System.out.println("This Java app ran successfully.");

	}

}
