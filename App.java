
public class App {

	public static void main(String[] args) {
		AstriskLogger ast = new AstriskLogger();
		String testCase = "Invalid";
		
		System.out.println("Astrisk Log Test : ");
		System.out.println("-------------------------------------------------");
		ast.log(testCase);
		System.out.println("-------------------------------------------------");
		
		System.out.println("Astrisk Error Test : ");
		System.out.println("-------------------------------------------------");
		ast.error(testCase);
		System.out.println("-------------------------------------------------");
		
		SpacedLogger space = new SpacedLogger();
		
		System.out.println("Spaced Log Test : ");
		System.out.println("-------------------------------------------------");
		space.log(testCase);
		System.out.println("-------------------------------------------------");

		System.out.println("Spaced Error Test : ");
		System.out.println("-------------------------------------------------");
		space.error(testCase);
		System.out.println("-------------------------------------------------");
	}

}
