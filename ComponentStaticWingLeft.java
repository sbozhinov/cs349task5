//@author Stan Bozhinov cs349 task5
public class ComponentStaticWingLeft extends A_ComponentStaticWing{

	public ComponentStaticWingLeft(DescriptorComponent descriptor,
			java.util.List<ComponentDynamicEngine> engines,
			java.util.List<ComponentDynamicAileron> ailerons,
			ComponentDynamicFlap flap,
			ComponentDynamicGearMain gear){
		
		super(descriptor,engines, ailerons, flap, gear);
	}

	@Override
	public void visit_(Visitor visitor) {
		super.visit_(visitor);
	}
}
