package structural.composite;

import java.util.List;

public class Composite extends Component {

	private List<Component> components;
	
	@Override
	public void operation() {
		// Implement component Operation
		System.out.println("Component operation");
	}

	@Override
	public Component getChild(int num) {
		// Reimplment how Composite return their children
		System.out.println("Returning my children");
		return new Leaf();
	}
}
