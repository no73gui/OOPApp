
public class SpacedLogger implements Logger{

	@Override
	public void log(String mess) {
		String[] splitS = mess.split("");
		String spacedString = String.join(" " , splitS);
		System.out.println(spacedString);
	}

	@Override
	public void error(String mess) {
		String spacedError = String.join(" " , mess.split(""));
		System.out.println("ERROR: " + spacedError);
	}
	
	

}
