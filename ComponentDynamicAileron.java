//@author Stan Bozhinov cs349 task5
public class ComponentDynamicAileron extends A_ComponentDynamic{

	public ComponentDynamicAileron(DescriptorComponent descriptor){
		super(descriptor);
	}


	public void visit_(Visitor visitor) {
		visitor.append("<aileron>");
		super.visit_(visitor);
		visitor.append("</aileron>");		
	}
	
}
