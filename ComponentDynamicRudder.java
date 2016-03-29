//@author Stan Bozhinov cs349 task5
public class ComponentDynamicRudder extends A_ComponentDynamic{

	public ComponentDynamicRudder(DescriptorComponent descriptor){
		super(descriptor);
	}

	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<rudder>");
		super.visit_(visitor);
		visitor.append("</rudder>");	
	}
}
