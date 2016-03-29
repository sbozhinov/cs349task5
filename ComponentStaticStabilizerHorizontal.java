//@author Stan Bozhinov cs349 task5
public class ComponentStaticStabilizerHorizontal extends A_ComponentStatic{
	private ComponentDynamicElevator _elevator;
	
	public ComponentStaticStabilizerHorizontal(DescriptorComponent descriptor,
			ComponentDynamicElevator elevator){
		super(descriptor);
		_elevator = elevator;
	}

	public ComponentDynamicElevator getElevator(){
		return _elevator;
		
	}
	
	@Override
	public void visit_(Visitor visitor) {
		visitor.append("<stabilizer-horizontal>");
		super.visit_(visitor);
		_elevator.visit_(visitor);
		visitor.append("</stabilizer-horizontal>");	
	}
}
