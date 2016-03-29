//@author Stan Bozhinov cs349 task5

public class ComponentDynamicGearMain extends A_ComponentDynamicGear{

	public ComponentDynamicGearMain(DescriptorComponent descriptor){
		super(descriptor);
	}

	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<gear-main>");
		super.visit_(visitor);
		visitor.append("</gear-main>");	
	}
	
}
