package structural.composite;

public abstract class Component {
	
	public abstract void operation();
	
	public void add(Component component) throws NoChildrenException {
		System.out.println("Default operation to add component");
	}
	
	public void remove(Component component) {
		System.out.println("Default operation to remove component");
	}
	
	public Component getChild(int num) {
		//Never return any childrens.Leaf classes will use this implementation
		//Component class will implement it to return their children.
		return null;
	}
}
