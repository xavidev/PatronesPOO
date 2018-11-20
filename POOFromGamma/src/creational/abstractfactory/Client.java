package creational.abstractfactory;

public class Client {
	
	public static void main(String[] args) {
		
		//Example of usage
		WidgetFactory factory = new PMWidgetFactory();
		ScrollBar sb = factory.createScrollBar();
		//Using a PM Type ScrollBar
		sb.draw();
		//Can reuse ScrollBar reference to point to another type of ScrollBar
		sb = new MotifWidgetFactory().createScrollBar();
		sb.draw();
	}

}
