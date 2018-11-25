package structural.composite;

public class Leaf extends Component{

	@Override
	public void operation() {
		// Implement operation
		System.out.println("Leaf operation");
	}
	
	@Override
	public void add(Component component) throws NoChildrenException {
		//Could implement a NoChildrenException for the add/get operations
		//Because Leaf is not a Composite so they can not manage childrens.
		throw new NoChildrenException();
	}

}
