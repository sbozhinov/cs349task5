//@author Stan Bozhinov cs349 task5
public class ComponentStaticStabilizerVertical extends A_ComponentStatic{
	private ComponentDynamicRudder _rudder;
	
	public ComponentStaticStabilizerVertical(DescriptorComponent descriptor,
			ComponentDynamicRudder rudder){
		super(descriptor);
		_rudder = rudder;
	}

	public ComponentDynamicRudder getRudder(){
		return _rudder;		
	}
	
	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<stabilizer-vertical>");
		super.visit_(visitor);
		_rudder.visit_(visitor);
		visitor.append("</stabilizer-vertical>");	
	}
}
