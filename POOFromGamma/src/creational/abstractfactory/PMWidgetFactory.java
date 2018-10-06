package creational.abstractfactory;

public class PMWidgetFactory extends WidgetFactory{

	@Override
	public Window CreateWindow() {
		return new PMWindow();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}

}
