//@author Stan Bozhinov cs349 task5

public class ComponentDynamicGearNose extends A_ComponentDynamicGear{

	public ComponentDynamicGearNose(DescriptorComponent descriptor){
		super(descriptor);
	}

	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<gear-nose>");
		super.visit_(visitor);
		visitor.append("</gear-nose>");	
	}
}
