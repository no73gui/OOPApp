
public class AstriskLogger implements Logger{

	@Override
	public void log(String mess) {
		System.out.println("***" + mess + "***");
		
	}

	@Override
	public void error(String mess) {
		System.out.println("****************");
		System.out.println("***Error: " + mess + "***");
		System.out.println("****************");
	}
	
	
}		
