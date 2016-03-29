//@author Stan Bozhinov cs349 task5
public class ComponentDynamicFlap extends A_ComponentDynamic{

	public ComponentDynamicFlap(DescriptorComponent descriptor){
		super(descriptor);
	}

	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<flap>");
		super.visit_(visitor);
		visitor.append("</flap>");	
	}
}
