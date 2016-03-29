//@author Stan Bozhinov cs349 task5
public class ComponentDynamicPropeller extends A_ComponentDynamic{

	public ComponentDynamicPropeller(DescriptorComponent descriptor){
		super(descriptor);
	}

	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<propeller>");
		super.visit_(visitor);
		visitor.append("</propeller>");
	}
	
}
