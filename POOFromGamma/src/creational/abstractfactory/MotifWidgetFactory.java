package creational.abstractfactory;

public class MotifWidgetFactory extends WidgetFactory{

	@Override
	public Window CreateWindow() {
		return new MotifWindow();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

}
