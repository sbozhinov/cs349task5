//@author Stan Bozhinov cs349 task5
public class ComponentDynamicElevator extends A_ComponentDynamic{

	public ComponentDynamicElevator(DescriptorComponent descriptor){
		super(descriptor);
	}

	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<elevator>");
		super.visit_(visitor);
		visitor.append("</elevator>");	
	}
}
