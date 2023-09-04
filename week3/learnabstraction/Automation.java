package learnabstraction;

public class Automation extends MultipleLanguage implements Language,TestTool{

	@Override
	public void selenium() {
		
		System.out.println("Implemented from TestTool infterface");
		
	}

	@Override
	public void java() {
		
		System.out.println("Implemented from Language Interface");
		
	}

	
	public static void main(String[] args) {
		
		System.out.println("This is for execution class");
		
		Automation aut = new Automation();
		aut.selenium();
		aut.java();
		aut.python();
	}
}
